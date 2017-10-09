package client;

import plainobjects.*;
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
//
//    ResponseBody createCheck()  throws IOException;
//
//    ResponseBody deleteCheck()  throws IOException;
//
//    FprUrlResults getFprUrlDetailsByResultId() throws IOException;
//
//    List<AsmTopLevelGroup> getGroups() throws IOException;
//
//    List<Integer> getGroupChecks() throws IOException;
//
//    ResponseBody createGroup() throws IOException;
//
//    ResponseBody deleteGroup() throws IOException;
//
//    ResponseBody updateGroup() throws IOException;
}
