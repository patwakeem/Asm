package com.github.patwakeem.asm.client;

import com.github.patwakeem.asm.authentication.AsmAuthentication;
import com.github.patwakeem.asm.authentication.AsmCredentialsAuthentication;
import com.github.patwakeem.asm.authentication.AsmEnvironmentAuthentication;
import com.github.patwakeem.asm.plainobjects.Silo;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {

    private AsmAuthentication asmCredentialsAuthentication;
    private AsmAuthentication asmEnvironmentAuthentication;

    @Before
    public void setUp() throws Exception {
        asmCredentialsAuthentication = new AsmCredentialsAuthentication("auth", Silo.ONE);
        asmEnvironmentAuthentication = new AsmEnvironmentAuthentication();
    }

    @Test
    public void testCreateApiClientWithCredentials() throws Exception {
        AsmApiClient asmApiClient = new AsmApiClient(asmCredentialsAuthentication);
    }

    @Test
    public void testCreateApiClientWithEnvironment() throws Exception {
        AsmApiClient asmApiClient = new AsmApiClient(asmEnvironmentAuthentication);

    }

    @Test
    public void testCreateApiClientWithHardCodedValues() throws Exception {
        AsmApiClient asmApiClient = new AsmApiClient("auth", Silo.ONE);
    }
}
