package com.github.patwakeem.asm.client;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import lombok.NonNull;
import okhttp3.ResponseBody;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class AsmApiClient implements ApiClient {

    private AsmApiService apiService = AsmApi.get();
    private String authTicket;
    private int silo;

    public AsmApiClient(String authTicket, Silo silo)  {
        this.authTicket = authTicket;
        setSiloFromObject(silo);
    }

    public AsmApiClient(AsmAuthentication asmCredentialsAuthentication) {
        this.authTicket = asmCredentialsAuthentication.toString();
        setSiloFromObject(asmCredentialsAuthentication.getSilo());
    }

    AsmApiClient(AsmAuthentication asmCredentialsAuthentication, AsmApiService asmApiService) {
        apiService = asmApiService;
        this.authTicket = asmCredentialsAuthentication.toString();
        setSiloFromObject(asmCredentialsAuthentication.getSilo());
    }

    private void setSiloFromObject(Silo s) {
        silo = s == Silo.ONE ? 1 : 2;
    }

    @Override
    public Optional<List<AsmCheck>> getAllChecks() throws IOException {
        return Optional.ofNullable(apiService.getAllChecks(silo, authTicket).execute().body());
    }

    @Override
    public Optional<AsmCheck> getCheck(int checkId) throws IOException {
        AsmCheck body = apiService.getCheck(silo, checkId, authTicket).execute().body();
        return Optional.ofNullable(body);
    }

    @Override
    public Optional<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException {

        List<AsmCheckDetailHistory> asmCheckDetailHistories = apiService.getCheckHistory(
                silo,
                getCheckHistoryRequest.getCheckId(),
                getCheckHistoryRequest.getFromUtc(),
                getCheckHistoryRequest.getToUtc(),
                1,
                authTicket).execute().body();

        return Optional.ofNullable(asmCheckDetailHistories);
    }

    @Override
    public Optional<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException {
        List<AsmLocation> body = apiService.getLocationsByCheckType(silo, checkType.toString(), authTicket).execute().body();
        return Optional.ofNullable(body);
    }

    @Override
    public ResponseWrapper runCheck(int checkId) throws IOException {
        Response<ResponseBody> executionResponse = apiService.runCheck(silo, checkId, authTicket).execute();
        return new RunCheckResult(executionResponse);
    }

    @Override
    public ResponseWrapper runCheck(@NonNull AsmCheck asmCheck) throws IOException {
        if (asmCheck.getId() == null) {
            throw new IllegalArgumentException();
        }

        return runCheck(asmCheck.getId());
    }

    @Override
    public ResponseWrapper createCheck(CreateCheckRequest createCheckRequest) throws IOException {
        Response<ResponseBody> executionResponse = apiService.createCheck(silo, createCheckRequest.getCheckTypeAsString(), createCheckRequest.getBody(), authTicket).execute();
        return new CreateCheckResult(executionResponse);
    }

    @Override
    public ResponseWrapper deleteCheck(int checkId) throws IOException {
        Response<ResponseBody> executionResponse = apiService.deleteCheck(silo, checkId, authTicket).execute();
        return new DeleteCheckResult(executionResponse);
    }

    @Override
    public ResponseWrapper deleteCheck(@NonNull AsmCheck asmCheck) throws IOException {
        if (asmCheck.getId() == null) {
            throw new IllegalArgumentException();
        }

        return deleteCheck(asmCheck.getId());
    }

    @Override
    public Optional<List<AsmTopLevelGroup>> getGroups() throws IOException {
        return Optional.ofNullable(apiService.getGroups(silo, authTicket).execute().body());
    }

    @Override
    public Optional<List<Integer>> getGroupChecks(int groupId) throws IOException {
        return Optional.ofNullable(apiService.getGroupChecks(silo, groupId, authTicket).execute().body());
    }

    @Override
    public ResponseWrapper createGroup(AddGroupBody addGroupBody) throws IOException {
        Response<ResponseBody> createResponse = apiService.createGroup(silo, addGroupBody, authTicket).execute();
        return new DeleteGroupResult(createResponse);
    }

    @Override
    public ResponseWrapper deleteGroup(int groupId) throws IOException {
        Response<ResponseBody> deleteResponse = apiService.deleteGroup(silo, groupId, authTicket).execute();
        return new DeleteGroupResult(deleteResponse);
    }

    @Override
    public ResponseWrapper deleteGroup(@NonNull AsmGroup asmGroup) throws IOException {
        if (asmGroup.getId() == null) {
            throw new IllegalArgumentException();
        }

        return deleteGroup(asmGroup.getId());
    }

    @Override
    public ResponseWrapper updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException {
        Response<ResponseBody> updateResponse = apiService.updateGroup(addGroupBody, silo, groupId, authTicket).execute();
        return new DeleteGroupResult(updateResponse);
    }

    @Override
    public Optional<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException {

        return Optional.ofNullable(
                apiService.getFprUrlDetailsByResultId(silo, checkId, getFprResultByIdBody, authTicket).execute().body()
        );
    }

    public String getAuthTicket() {
        return authTicket;
    }

    public int getSilo() {
        return silo;
    }
}