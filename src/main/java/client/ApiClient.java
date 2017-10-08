package client;

import okhttp3.ResponseBody;
import plainobjects.*;

import java.io.IOException;
import java.util.List;

interface ApiClient {

    List<AsmCheck> getAllChecks() throws IOException;

    AsmCheck getCheck(int id) throws IOException;

//    TODO: Finish these.
//    List<AsmCheckDetailHistory> getCheckHistory() throws IOException;
//
//    List<AsmLocation> getLocationsByCheckType() throws IOException;
//
//    ResponseBody runCheck()  throws IOException;
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
