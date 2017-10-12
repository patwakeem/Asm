package com.github.patwakeem.asm.client;

import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

interface ApiClient {

    Optional<List<AsmCheck>> getAllChecks() throws IOException;

    Optional<AsmCheck> getCheck(int checkId) throws IOException;

    Optional<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException;

    Optional<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException;

    ResponseWrapper runCheck(int checkId) throws IOException;

    ResponseWrapper createCheck(CreateCheckRequest createCheckRequest) throws IOException;

    ResponseWrapper deleteCheck(int checkId) throws IOException;

    Optional<FprUrlResults> getFprUrlDetailsByResultId(int checkId, GetFprResultByIdBody getFprResultByIdBody) throws IOException;

    Optional<List<AsmTopLevelGroup>> getGroups() throws IOException;

    Optional<List<Integer>> getGroupChecks(int groupId) throws IOException;

    ResponseWrapper createGroup(AddGroupBody addGroupBody) throws IOException;

    ResponseWrapper deleteGroup(int groupId) throws IOException;

    ResponseWrapper updateGroup(int groupId, AddGroupBody addGroupBody) throws IOException;
}
