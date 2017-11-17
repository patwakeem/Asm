package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import io.reactivex.Observable;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.List;

public class ReactiveAsmApiClient implements ReactiveApiClient {

    private ReactiveAsmApiService apiService = ReactiveAsmApi.get();
    private String authTicket;
    private int silo;

    private final int DETAIL_LEVEL = 1;

    public ReactiveAsmApiClient(String authTicket, Silo silo) {
        this.authTicket = authTicket;
        setSiloFromObject(silo);
    }

    public ReactiveAsmApiClient(AsmAuthentication asmCredentialsAuthentication) {
        this.authTicket = asmCredentialsAuthentication.toString();
        setSiloFromObject(asmCredentialsAuthentication.getSilo());
    }

    ReactiveAsmApiClient(AsmAuthentication asmCredentialsAuthentication, ReactiveAsmApiService asmApiService) {
        apiService = asmApiService;
        this.authTicket = asmCredentialsAuthentication.toString();
        setSiloFromObject(asmCredentialsAuthentication.getSilo());
    }

    private void setSiloFromObject(Silo s) {
        silo = s == Silo.ONE ? 1 : 2;
    }

//    TODO: Finish this class.

    @Override
    public Observable<List<AsmCheck>> getAllChecks() throws IOException {
        return apiService.getChecks(silo, authTicket);
    }

    @Override
    public Observable<AsmCheck> getCheck(int checkId) throws IOException {
        return apiService.getCheck(silo, checkId, authTicket);
    }

    @Override
    public Observable<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException {
        return apiService.getCheckHistory(
                silo,
                getCheckHistoryRequest.getCheckId(),
                getCheckHistoryRequest.getFromUtc(),
                getCheckHistoryRequest.getToUtc(),
                DETAIL_LEVEL,
                authTicket
        );
    }

    @Override
    public Observable<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException {
        return apiService.getLocationsByCheckType(silo, checkType.toString(), authTicket);
    }

    @Override
    public Observable<ResponseBody> runCheck(int checkId) throws IOException {
        return apiService.runCheck(silo, checkId, authTicket);
    }

    @Override
    public Observable<ResponseBody> runCheck(AsmCheck asmCheck) throws IOException {
        return apiService.runCheck(silo, asmCheck.getId(), authTicket);
    }

    @Override
    public Observable<ResponseBody> createCheck(CreateCheckRequest createCheckRequest) throws IOException {
        return apiService.createCheck(silo, createCheckRequest.getCheckType().toString(), createCheckRequest.getBody(), authTicket);
    }

    @Override
    public Observable<ResponseBody> deleteCheck(int checkId) throws IOException {
        return apiService.deleteCheck(silo, checkId, authTicket);
    }

    @Override
    public Observable<ResponseBody> deleteCheck(AsmCheck asmCheck) throws IOException {
        return apiService.deleteCheck(silo, asmCheck.getId(), authTicket);
    }

    @Override
    public Observable<List<ScreenshotMetaData>> getScreenshotMetaDataByResultId(int checkId, String resultId) throws IOException {
        return apiService.getScreenshotMetaDataByResultId(silo, checkId, resultId, authTicket);
    }

    @Override
    public Observable<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException {
        return apiService.getFprUrlDetailsByResultId(silo, checkId, getFprResultByIdBody, authTicket);
    }

    @Override
    public Observable<List<AsmTopLevelGroup>> getGroups() throws IOException {
        return apiService.getGroups(silo, authTicket);
    }

    @Override
    public Observable<List<Integer>> getGroupChecks(int groupId) throws IOException {
        return apiService.getGroupChecks(silo, groupId, authTicket);
    }

    @Override
    public Observable<ResponseBody> createGroup(AddGroupBody addGroupBody) throws IOException {
        return apiService.createGroup(silo, addGroupBody, authTicket);
    }

    @Override
    public Observable<ResponseBody> deleteGroup(int groupId) throws IOException {
        return apiService.deleteGroup(silo, groupId, authTicket);
    }

    @Override
    public Observable<ResponseBody> deleteGroup(AsmGroup asmGroup) throws IOException {
        return apiService.deleteGroup(silo, asmGroup.getId(), authTicket);
    }

    @Override
    public Observable<ResponseBody> updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException {
        return apiService.updateGroup(addGroupBody, silo, groupId, authTicket);
    }
}