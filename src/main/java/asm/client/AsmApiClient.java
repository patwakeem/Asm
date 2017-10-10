package asm.client;

import asm.authentication.AsmAuthentication;
import asm.plainobjects.*;
import asm.requests.CreateCheckRequest;
import asm.requests.GetCheckHistoryRequest;
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
    public Optional<AsmCheck> getCheck(int id) throws IOException {
        return Optional.ofNullable(apiService.getCheck(silo, id, authTicket).execute().body());
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
    public ResponseWrapper runCheck(int id) throws IOException {
        Response<ResponseBody> executionResponse = apiService.runCheck(silo, id, authTicket).execute();
        return new RunCheckResult(executionResponse);
    }

    @Override
    public ResponseWrapper createCheck(CreateCheckRequest createCheckRequest) throws IOException {
        Response<ResponseBody> executionResponse = apiService.createCheck(silo, createCheckRequest.getCheckTypeAsString(), createCheckRequest.getBody(), authTicket).execute();
        return new CreateCheckResult(executionResponse);
    }

    @Override
    public ResponseWrapper deleteCheck(int id) throws IOException {
        Response<ResponseBody> executionResponse = apiService.deleteCheck(silo, id, authTicket).execute();
        return new DeleteCheckResult(executionResponse);
    }

    @Override
    public Optional<List<AsmTopLevelGroup>> getGroups() throws IOException {
        return Optional.ofNullable(apiService.getGroups(silo, authTicket).execute().body());
    }

    @Override
    public Optional<List<Integer>> getGroupChecks(int id) throws IOException {
        return Optional.ofNullable(apiService.getGroupChecks(silo, id, authTicket).execute().body());
    }

    @Override
    public ResponseWrapper createGroup(AddGroupBody addGroupBody) throws IOException {
        Response<ResponseBody> createResponse = apiService.createGroup(silo, addGroupBody, authTicket).execute();
        return new DeleteGroupResult(createResponse);
    }

    @Override
    public ResponseWrapper deleteGroup(int id) throws IOException {
        Response<ResponseBody> deleteResponse = apiService.deleteGroup(silo, id, authTicket).execute();
        return new DeleteGroupResult(deleteResponse);
    }

    @Override
    public ResponseWrapper updateGroup(int id, AddGroupBody addGroupBody) throws IOException {
        Response<ResponseBody> updateResponse = apiService.updateGroup(addGroupBody, silo, id, authTicket).execute();
        return new DeleteGroupResult(updateResponse);
    }

    public String getAuthTicket() {
        return authTicket;
    }

    public int getSilo() {
        return silo;
    }
}