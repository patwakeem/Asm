package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import io.reactivex.Observable;

import java.io.IOException;
import java.util.List;

public interface ReactiveApiClient {

    Observable<List<AsmCheck>> getAllChecks() throws IOException;

    Observable<AsmCheck> getCheck(int checkId) throws IOException;

    Observable<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException;

    Observable<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException;

    Observable<ResponseWrapper> runCheck(int checkId) throws IOException;

    Observable<ResponseWrapper> runCheck(AsmCheck asmCheck) throws IOException;

    Observable<ResponseWrapper> createCheck(CreateCheckRequest createCheckRequest) throws IOException;

    Observable<ResponseWrapper> deleteCheck(int checkId) throws IOException;

    Observable<ResponseWrapper> deleteCheck(AsmCheck asmCheck) throws IOException;

    Observable<List<ScreenshotMetaData>> getScreenshotMetaDataByResultId(int checkId, String resultId) throws IOException;

    Observable<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException;

    Observable<List<AsmTopLevelGroup>> getGroups() throws IOException;

    Observable<List<Integer>> getGroupChecks(int groupId) throws IOException;

    Observable<ResponseWrapper> createGroup(AddGroupBody addGroupBody) throws IOException;

    Observable<ResponseWrapper> deleteGroup(int groupId) throws IOException;

    Observable<ResponseWrapper> deleteGroup(AsmGroup asmGroup) throws IOException;

    Observable<ResponseWrapper> updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException;

}
