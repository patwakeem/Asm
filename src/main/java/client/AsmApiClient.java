package client;

import authentication.AsmAuthentication;
import authentication.AsmCredentialsAuthentication;
import plainobjects.AsmCheck;
import plainobjects.Silo;

import java.io.IOException;
import java.util.List;

public class AsmApiClient implements ApiClient {

    private AsmApiService apiService = AsmApi.get();
    private String authTicket;
    private int silo;

    public AsmApiClient(String authTicket, Silo silo)  {

        this.authTicket = authTicket;
        setSiloFromObject(silo);
    }

    public AsmApiClient(AsmAuthentication asmCredentialsAuthentication) {

        this.authTicket = asmCredentialsAuthentication.toString();
        setSiloFromObject(asmCredentialsAuthentication.getSilo());
    }

    private void setSiloFromObject(Silo s) {
        silo = s == Silo.ONE ? 1 : 2;
    }

    @Override
    public List<AsmCheck> getAllChecks() throws IOException {
        return apiService.getAllChecks(silo, authTicket).execute().body();
    }

    @Override
    public AsmCheck getCheck(int id) throws IOException {
        return apiService.getCheck(silo, id, authTicket).execute().body();
    }

    public String getAuthTicket() {
        return authTicket;
    }

    public int getSilo() {
        return silo;
    }
}