package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.authentication.AsmCredentialsAuthentication;
import com.github.patwakeem.asm.enumeration.CheckType;
import com.github.patwakeem.asm.enumeration.Silo;
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
    public void getAllChecks() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getChecks(SILO, authentication.toString());

        asmApiClient.getAllChecks();

        Mockito.verify(mockService).getChecks(SILO, authentication.toString());
    }

    @Test
    public void getCheck() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getCheck(SILO, CHECK_ID, authentication.toString());

        asmApiClient.getCheck(CHECK_ID);

        Mockito.verify(mockService).getCheck(SILO, CHECK_ID, authentication.toString());
    }

    @Test
    public void getCheckHistory() throws Exception {
        String fromUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis() - 1000L);
        String toUtc = DateHelper.formatUnixTimeForAsmApi(System.currentTimeMillis());
        int detailLevel = 1;

        Mockito.doReturn(mockedReturn).when(mockService).getCheckHistory(SILO, CHECK_ID, fromUtc, toUtc, detailLevel, authentication.toString());

        GetCheckHistoryRequest getCheckHistoryRequest = new GetCheckHistoryRequest(fromUtc, toUtc, CHECK_ID);
        asmApiClient.getCheckHistory(getCheckHistoryRequest);

        Mockito.verify(mockService).getCheckHistory(SILO, CHECK_ID, fromUtc, toUtc, detailLevel, authentication.toString());
    }

    @Test
    public void getLocationsByCheckType() throws Exception {
        Mockito.doReturn(mockedReturn).when(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());

        asmApiClient.getLocationsByCheckType(CheckType.BROWSER);

        Mockito.verify(mockService).getLocationsByCheckType(SILO, CheckType.BROWSER.toString(), authentication.toString());
    }

    @Test
    public void runCheck() throws Exception {
    }

    @Test
    public void createCheck() throws Exception {
    }

    @Test
    public void deleteCheck() throws Exception {
    }

    @Test
    public void getScreenshotMetaDataByResultId() throws Exception {
    }

    @Test
    public void getFprUrlDetailsByResultId() throws Exception {
    }

    @Test
    public void getGroups() throws Exception {
    }

    @Test
    public void getGroupChecks() throws Exception {
    }

    @Test
    public void createGroup() throws Exception {
    }

    @Test
    public void deleteGroup() throws Exception {
    }

    @Test
    public void updateGroup() throws Exception {
    }
}