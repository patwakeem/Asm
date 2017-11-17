package com.github.patwakeem.asm.client;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.authentication.AsmCredentialsAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import com.github.patwakeem.asm.util.DateHelper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;

public class AsmApiClientTest {

    private ApiClient asmApiClient;
    private final AsmAuthentication authentication = new AsmCredentialsAuthentication("auth", Silo.ONE);

    private final int SILO = 1;
    private final int CHECK_ID = 1;
    private final int GROUP_ID = 1;

    private final Call mockedReturn = Mockito.mock(Call.class);

    @Mock
    private AsmApiService mockService = Mockito.mock(AsmApiService.class);

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        asmApiClient = new AsmApiClient(authentication, mockService);
    }

    @Test
    public void testGetAllChecks() throws Exception {
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getAllChecks(SILO, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getAllChecks();

        Mockito.verify(mockService).getAllChecks(SILO, authentication.toString());
    }

    @Test
    public void testGetCheck() throws Exception {
        Response r = Response.success(new AsmCheck());

        Mockito.doReturn(mockedReturn).when(mockService).getCheck(SILO, CHECK_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getCheck(1);

        Mockito.verify(mockService).getCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testGetCheckHistory() throws IOException {
        Response r = Response.success(new ArrayList<>());
        String utcTime = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis());

        Mockito.doReturn(mockedReturn).when(mockService).getCheckHistory(SILO, CHECK_ID, utcTime, utcTime, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getCheckHistory(new GetCheckHistoryRequest(utcTime, utcTime, 1));

        Mockito.verify(mockService).getCheckHistory(SILO, CHECK_ID, utcTime, utcTime, 1, authentication.toString());
    }

    @Test
    public void testGetLocationsByCheckType() throws IOException {
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getLocationsByCheckType(CheckType.BROWSER);

        Mockito.verify(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());
    }

    @Test
    public void testRunCheck() throws IOException {
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).runCheck(SILO, CHECK_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.runCheck(1);

        Mockito.verify(mockService).runCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testCreateCheck() throws IOException {
        Response r = Response.success(new Object());

        CreateCheckBody createCheckBody = new CreateBrowserCheckBody();
        CreateCheckRequest createCheckRequest = new CreateCheckRequest(CheckType.BROWSER, createCheckBody);

        Mockito.doReturn(mockedReturn).when(mockService).createCheck(SILO, CheckType.BROWSER.toString(), createCheckRequest.getBody(), authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.createCheck(createCheckRequest);

        Mockito.verify(mockService).createCheck(SILO, CheckType.BROWSER.toString(), createCheckBody.getJson(), authentication.toString());
    }

    @Test
    public void testDeleteCheck() throws IOException {
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).deleteCheck(SILO, CHECK_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.deleteCheck(CHECK_ID);

        Mockito.verify(mockService).deleteCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testGetGroups() throws IOException {
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getGroups(SILO, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getGroups();

        Mockito.verify(mockService).getGroups(SILO, authentication.toString());
    }

    @Test
    public void testGetGroupChecks() throws IOException {
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getGroupChecks(SILO, GROUP_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getGroupChecks(GROUP_ID);

        Mockito.verify(mockService).getGroupChecks(SILO, GROUP_ID, authentication.toString());
    }

    @Test
    public void testCreateGroup() throws IOException {
        Response r = Response.success(new Object());
        AddGroupBody addGroupBody = new AddGroupBody();

        Mockito.doReturn(mockedReturn).when(mockService).createGroup(SILO, addGroupBody, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.createGroup(addGroupBody);

        Mockito.verify(mockService).createGroup(SILO, addGroupBody, authentication.toString());
    }

    @Test
    public void testDeleteGroup() throws IOException {
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).deleteGroup(SILO, GROUP_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.deleteGroup(GROUP_ID);

        Mockito.verify(mockService).deleteGroup(SILO, GROUP_ID, authentication.toString());
    }

    @Test
    public void testUpdateGroup() throws IOException {
        Response r = Response.success(new Object());
        AddGroupBody addGroupBody = new AddGroupBody();

        Mockito.doReturn(mockedReturn).when(mockService).updateGroup(addGroupBody, SILO, GROUP_ID, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.updateGroup(GROUP_ID, addGroupBody);

        Mockito.verify(mockService).updateGroup(addGroupBody, SILO, GROUP_ID, authentication.toString());
    }

    @Test
    public void testGetFprUrlDetailsByResultId() throws IOException {
        Response r = Response.success(new FprUrlResults());
        GetFprResultByIdBody getFprResultByIdBody = new GetFprResultByIdBody();

        Mockito.doReturn(mockedReturn).when(mockService).getFprUrlDetailsByResultId(SILO, CHECK_ID, getFprResultByIdBody, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getFprUrlDetailsByResultId(CHECK_ID, getFprResultByIdBody);

        Mockito.verify(mockService).getFprUrlDetailsByResultId(SILO, CHECK_ID, getFprResultByIdBody, authentication.toString());
    }

    @Test
    public void testScreenshotByResultIdCall() throws IOException {

        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getScreenshotMetaDataByResultId(1, 1, "result", authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getScreenshotMetaDataByResultId(1, "result");

        Mockito.verify(mockService).getScreenshotMetaDataByResultId(1, 1, "result", authentication.toString());

    }
}