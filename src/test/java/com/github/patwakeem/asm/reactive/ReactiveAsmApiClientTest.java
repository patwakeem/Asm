package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.authentication.AsmCredentialsAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
import com.github.patwakeem.asm.plainobjects.AddGroupBody;
import com.github.patwakeem.asm.plainobjects.CreateBrowserCheckBody;
import com.github.patwakeem.asm.plainobjects.CreateCheckBody;
import com.github.patwakeem.asm.plainobjects.GetFprResultByIdBody;
import com.github.patwakeem.asm.requests.CreateCheckRequest;
import com.github.patwakeem.asm.requests.GetCheckHistoryRequest;
import com.github.patwakeem.asm.util.DateHelper;
import io.reactivex.Observable;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ReactiveAsmApiClientTest {

    private ReactiveApiClient asmApiClient;
    private final AsmAuthentication authentication = new AsmCredentialsAuthentication("auth", Silo.ONE);

    private final int CHECK_ID = 1;
    private final int GROUP_ID = 1;
    private final int SILO = 1;

    private final Observable mockedReturn = Mockito.mock(Observable.class);

    @Mock
    private ReactiveAsmApiService mockService = Mockito.mock(ReactiveAsmApiService.class);

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        asmApiClient = new ReactiveAsmApiClient(authentication, mockService);
    }

    @Test
    public void testReactiveGetAllChecks() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getChecks(SILO, authentication.toString());

        asmApiClient.getAllChecks();

        Mockito.verify(mockService).getChecks(SILO, authentication.toString());
    }

    @Test
    public void testReactiveGetCheck() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getCheck(SILO, CHECK_ID, authentication.toString());

        asmApiClient.getCheck(CHECK_ID);

        Mockito.verify(mockService).getCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testReactiveGetCheckHistory() throws Exception {
        String fromUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis() - 1000L);
        String toUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis());
        int detailLevel = 1;

        Mockito.doReturn(mockedReturn).when(mockService).getCheckHistory(SILO, CHECK_ID, fromUtc, toUtc, detailLevel, authentication.toString());

        GetCheckHistoryRequest getCheckHistoryRequest = new GetCheckHistoryRequest(fromUtc, toUtc, CHECK_ID);
        asmApiClient.getCheckHistory(getCheckHistoryRequest);

        Mockito.verify(mockService).getCheckHistory(SILO, CHECK_ID, fromUtc, toUtc, detailLevel, authentication.toString());
    }

    @Test
    public void testReactiveGetLocationsByCheckType() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());

        asmApiClient.getLocationsByCheckType(CheckType.BROWSER);

        Mockito.verify(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());
    }

    @Test
    public void testReactiveRunCheck() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).runCheck(SILO, CHECK_ID, authentication.toString());

        asmApiClient.runCheck(CHECK_ID);

        Mockito.verify(mockService).runCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testReactiveCreateCheck() throws Exception {
        CreateCheckBody createCheckBody = new CreateBrowserCheckBody();
        CreateCheckRequest createCheckRequest = new CreateCheckRequest(CheckType.BROWSER, createCheckBody);

        Mockito.doReturn(mockedReturn).when(mockService).createCheck(SILO, "browser", createCheckRequest.getBody(), authentication.toString());

        asmApiClient.createCheck(createCheckRequest);

        Mockito.verify(mockService).createCheck(SILO, "browser", createCheckRequest.getBody(), authentication.toString());
    }

    @Test
    public void testReactiveDeleteCheck() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).deleteCheck(SILO, CHECK_ID, authentication.toString());

        asmApiClient.deleteCheck(CHECK_ID);

        Mockito.verify(mockService).deleteCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void testReactiveGetScreenshotMetaDataByResultId() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getScreenshotMetaDataByResultId(SILO, CHECK_ID, "result", authentication.toString());

        asmApiClient.getScreenshotMetaDataByResultId(CHECK_ID, "result");

        Mockito.verify(mockService).getScreenshotMetaDataByResultId(SILO, CHECK_ID, "result", authentication.toString());
    }

    @Test
    public void testReactiveGetFprUrlDetailsByResultId() throws Exception {
        GetFprResultByIdBody getResultByIdBody = new GetFprResultByIdBody();
        Mockito.doReturn(mockedReturn).when(mockService).getFprUrlDetailsByResultId(SILO, CHECK_ID, getResultByIdBody, authentication.toString());

        asmApiClient.getFprUrlDetailsByResultId(CHECK_ID, getResultByIdBody);

        Mockito.verify(mockService).getFprUrlDetailsByResultId(SILO, CHECK_ID, getResultByIdBody, authentication.toString());
    }

    @Test
    public void testReactiveGetGroups() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getGroups(SILO, authentication.toString());

        asmApiClient.getGroups();

        Mockito.verify(mockService).getGroups(SILO, authentication.toString());
    }

    @Test
    public void testReactiveGetGroupChecks() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getGroupChecks(SILO, GROUP_ID, authentication.toString());

        asmApiClient.getGroupChecks(GROUP_ID);

        Mockito.verify(mockService).getGroupChecks(SILO, GROUP_ID, authentication.toString());
    }

    @Test
    public void testReactiveCreateGroup() throws Exception {
        AddGroupBody addGroupBody = new AddGroupBody();
        Mockito.doReturn(mockedReturn).when(mockService).createGroup(SILO, addGroupBody, authentication.toString());

        asmApiClient.createGroup(addGroupBody);

        Mockito.verify(mockService).createGroup(SILO, addGroupBody, authentication.toString());
    }

    @Test
    public void testReactiveDeleteGroup() throws Exception {
        asmApiClient.deleteGroup(GROUP_ID);

        Mockito.verify(mockService).deleteGroup(SILO, GROUP_ID, authentication.toString());
    }

    @Test
    public void testReactiveUpdateGroup() throws Exception {
        AddGroupBody addGroupBody = new AddGroupBody();
        asmApiClient.updateGroup(GROUP_ID, addGroupBody);

        Mockito.verify(mockService).updateGroup(addGroupBody, SILO, GROUP_ID, authentication.toString());
    }
}