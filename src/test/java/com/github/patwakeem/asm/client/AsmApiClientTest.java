package com.github.patwakeem.asm.client;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.authentication.AsmEnvironmentAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.plainobjects.*;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import com.github.patwakeem.asm.util.DateHelper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;

public class AsmApiClientTest {

    private ApiClient asmApiClient;
    private final AsmAuthentication authentication = new AsmEnvironmentAuthentication();

    @Mock
    private AsmApiService mockService = Mockito.mock(AsmApiService.class);

    @Before
    public void setUp() throws Exception {
        asmApiClient = new AsmApiClient(authentication, mockService);
    }

    @Test
    public void testGetAllChecks() throws Exception {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getAllChecks(1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getAllChecks();

        Mockito.verify(mockService).getAllChecks(1, authentication.toString());
    }

    @Test
    public void testGetCheck() throws Exception {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new AsmCheck());

        Mockito.doReturn(mockedReturn).when(mockService).getCheck(1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getCheck(1);

        Mockito.verify(mockService).getCheck(1, 1, authentication.toString());
    }

    @Test
    public void testGetCheckHistory() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());
        String utcTime = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis());

        Mockito.doReturn(mockedReturn).when(mockService).getCheckHistory(1, 1, utcTime, utcTime, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getCheckHistory(new GetCheckHistoryRequest(utcTime, utcTime, 1));

        Mockito.verify(mockService).getCheckHistory(1, 1, utcTime, utcTime, 1, authentication.toString());
    }

    @Test
    public void testGetLocationsByCheckType() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getLocationsByCheckType(1, CheckType.BROWSER.toString(), authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getLocationsByCheckType(CheckType.BROWSER);

        Mockito.verify(mockService).getLocationsByCheckType(1, CheckType.BROWSER.toString(), authentication.toString());
    }

    @Test
    public void testRunCheck() throws IOException {

        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).runCheck(1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.runCheck(1);

        Mockito.verify(mockService).runCheck(1, 1, authentication.toString());
    }

    @Test
    public void testCreateCheck() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());

        CreateCheckBody createCheckBody = new CreateBrowserCheckBody();
        CreateCheckRequest createCheckRequest = new CreateCheckRequest(CheckType.BROWSER, createCheckBody);

        Mockito.doReturn(mockedReturn).when(mockService).createCheck(1, CheckType.BROWSER.toString(), createCheckRequest.getBody(), authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.createCheck(createCheckRequest);

        Mockito.verify(mockService).createCheck(1, CheckType.BROWSER.toString(), createCheckBody.getJson(), authentication.toString());
    }

    @Test
    public void testDeleteCheck() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).deleteCheck(1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.deleteCheck(1);

        Mockito.verify(mockService).deleteCheck(1, 1, authentication.toString());
    }

    @Test
    public void testGetGroups() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getGroups(1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getGroups();

        Mockito.verify(mockService).getGroups(1, authentication.toString());
    }

    @Test
    public void testGetGroupChecks() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new ArrayList<>());

        Mockito.doReturn(mockedReturn).when(mockService).getGroupChecks(1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getGroupChecks(1);

        Mockito.verify(mockService).getGroupChecks(1, 1, authentication.toString());
    }

    @Test
    public void testCreateGroup() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());
        AddGroupBody addGroupBody = new AddGroupBody();

        Mockito.doReturn(mockedReturn).when(mockService).createGroup(1, addGroupBody, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.createGroup(addGroupBody);

        Mockito.verify(mockService).createGroup(1, addGroupBody, authentication.toString());
    }

    @Test
    public void testDeleteGroup() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());

        Mockito.doReturn(mockedReturn).when(mockService).deleteGroup(1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.deleteGroup(1);

        Mockito.verify(mockService).deleteGroup(1, 1, authentication.toString());
    }

    @Test
    public void testUpdateGroup() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new Object());
        AddGroupBody addGroupBody = new AddGroupBody();

        Mockito.doReturn(mockedReturn).when(mockService).updateGroup(addGroupBody, 1, 1, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.updateGroup(1, addGroupBody);

        Mockito.verify(mockService).updateGroup(addGroupBody, 1, 1, authentication.toString());
    }

    @Test
    public void testGetFprUrlDetailsByResultId() throws IOException {
        Call mockedReturn = Mockito.mock(Call.class);
        Response r = Response.success(new FprUrlResults());
        GetFprResultByIdBody getFprResultByIdBody = new GetFprResultByIdBody();

        Mockito.doReturn(mockedReturn).when(mockService).getFprUrlDetailsByResultId(1, 1, getFprResultByIdBody, authentication.toString());
        Mockito.doReturn(r).when(mockedReturn).execute();

        asmApiClient.getFprUrlDetailsByResultId(1, getFprResultByIdBody);

        Mockito.verify(mockService).getFprUrlDetailsByResultId(1, 1, getFprResultByIdBody, authentication.toString());
    }
}