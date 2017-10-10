package asm.client;

import asm.plainobjects.*;
import asm.requests.CreateCheckRequest;
import asm.requests.GetCheckHistoryRequest;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

interface ApiClient {

    Optional<List<AsmCheck>> getAllChecks() throws IOException;

    Optional<AsmCheck> getCheck(int id) throws IOException;

    Optional<List<AsmCheckDetailHistory>> getCheckHistory(GetCheckHistoryRequest getCheckHistoryRequest) throws IOException;

    Optional<List<AsmLocation>> getLocationsByCheckType(CheckType checkType) throws IOException;

    ResponseWrapper runCheck(int id) throws IOException;

    ResponseWrapper createCheck(CreateCheckRequest createCheckRequest) throws IOException;

    ResponseWrapper deleteCheck(int id) throws IOException;

//    FprUrlResults getFprUrlDetailsByResultId() throws IOException;

    Optional<List<AsmTopLevelGroup>> getGroups() throws IOException;

    Optional<List<Integer>> getGroupChecks(int id) throws IOException;

    ResponseWrapper createGroup(AddGroupBody addGroupBody) throws IOException;

    ResponseWrapper deleteGroup(int id) throws IOException;

    ResponseWrapper updateGroup(int id, AddGroupBody addGroupBody) throws IOException;
}
