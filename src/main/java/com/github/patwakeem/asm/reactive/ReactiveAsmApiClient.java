package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import io.reactivex.Observable;

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
    public Observable<ResponseWrapper> runCheck(int checkId) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> runCheck(AsmCheck asmCheck) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> createCheck(CreateCheckRequest createCheckRequest) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> deleteCheck(int checkId) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> deleteCheck(AsmCheck asmCheck) throws IOException {
        return null;
    }

    @Override
    public Observable<List<ScreenshotMetaData>> getScreenshotMetaDataByResultId(int checkId, String resultId) throws IOException {
        return null;
    }

    @Override
    public Observable<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException {
        return null;
    }

    @Override
    public Observable<List<AsmTopLevelGroup>> getGroups() throws IOException {
        return null;
    }

    @Override
    public Observable<List<Integer>> getGroupChecks(int groupId) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> createGroup(AddGroupBody addGroupBody) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> deleteGroup(int groupId) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> deleteGroup(AsmGroup asmGroup) throws IOException {
        return null;
    }

    @Override
    public Observable<ResponseWrapper> updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException {
        return null;
    }
}