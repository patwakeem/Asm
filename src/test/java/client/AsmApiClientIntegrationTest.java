package client;

import authentication.AsmAuthentication;
import authentication.AsmEnvironmentAuthentication;
import org.junit.Before;
import org.junit.Test;
import plainobjects.AsmCheck;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class AsmApiClientIntegrationTest {

    private ApiClient asmApiClient;
    private final AsmAuthentication authentication = new AsmEnvironmentAuthentication();

    @Before
    public void setUp() throws Exception {
        asmApiClient = new AsmApiClient(authentication);
    }

    @Test
    public void getAllChecks() throws Exception {
        Optional<List<AsmCheck>> allChecks = asmApiClient.getAllChecks();
        assertNotNull(allChecks.get());
    }

    @Test
    public void testInvalidCheckIdIsNotPresent() throws Exception {
        Optional<AsmCheck> check = asmApiClient.getCheck(-1);
        assertFalse(check.isPresent());
    }
}