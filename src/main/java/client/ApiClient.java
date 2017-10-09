package client;

import plainobjects.*;
import requests.CreateCheckRequest;
import requests.GetCheckHistoryRequest;

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
//
//    FprUrlResults getFprUrlDetailsByResultId() throws IOException;
//
//    List<AsmTopLevelGroup> getGroups() throws IOException;
//
//    List<Integer> getGroupChecks() throws IOException;
//
//    ResponseWrapper createGroup() throws IOException;
//
//    ResponseWrapper deleteGroup() throws IOException;
//
//    ResponseWrapper updateGroup() throws IOException;
}
