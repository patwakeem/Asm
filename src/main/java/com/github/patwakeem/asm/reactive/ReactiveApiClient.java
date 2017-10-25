package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import io.reactivex.Observable;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.List;

public interface ReactiveApiClient {

    Observable<List<AsmCheck>> getAllChecks() throws IOException;

    Observable<AsmCheck> getCheck(int checkId) throws IOException;

    Observable<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException;

    Observable<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException;

    Observable<ResponseBody> runCheck(int checkId) throws IOException;

    Observable<ResponseBody> runCheck(AsmCheck asmCheck) throws IOException;

    Observable<ResponseBody> createCheck(CreateCheckRequest createCheckRequest) throws IOException;

    Observable<ResponseBody> deleteCheck(int checkId) throws IOException;

    Observable<ResponseBody> deleteCheck(AsmCheck asmCheck) throws IOException;

    Observable<List<ScreenshotMetaData>> getScreenshotMetaDataByResultId(int checkId, String resultId) throws IOException;

    Observable<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException;

    Observable<List<AsmTopLevelGroup>> getGroups() throws IOException;

    Observable<List<Integer>> getGroupChecks(int groupId) throws IOException;

    Observable<ResponseBody> createGroup(AddGroupBody addGroupBody) throws IOException;

    Observable<ResponseBody> deleteGroup(int groupId) throws IOException;

    Observable<ResponseBody> deleteGroup(AsmGroup asmGroup) throws IOException;

    Observable<ResponseBody> updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException;

}
