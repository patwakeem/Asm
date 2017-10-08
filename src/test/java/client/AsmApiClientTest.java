package client;

import authentication.AsmAuthentication;
import authentication.AsmEnvironmentAuthentication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import plainobjects.AsmCheck;
import plainobjects.Silo;

import java.util.List;

import static org.junit.Assert.*;

public class AsmApiClientTest {


    private ApiClient asmApiClient;
    private final AsmAuthentication authentication = new AsmEnvironmentAuthentication();

    @Before
    public void setUp() throws Exception {
        asmApiClient = new AsmApiClient(authentication);
    }


    @Test
    public void getAllChecks() throws Exception {

        List<AsmCheck> allChecks = asmApiClient.getAllChecks();

    }
}
