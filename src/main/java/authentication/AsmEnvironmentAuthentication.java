package authentication;

import plainobjects.Silo;

import java.util.Map;

public class AsmEnvironmentAuthentication implements AsmAuthentication {

    private Silo silo;
    private String authTicket;

    public AsmEnvironmentAuthentication() {

        Map<String, String> env = System.getenv();
        String apiKey = env.get("ASM_API_KEY");
        String asmApiSilo = env.get("ASM_API_SILO");

        this.silo = Integer.valueOf(asmApiSilo) == 1 ? Silo.ONE : Silo.TWO;
        this.authTicket = apiKey;
    }

    @Override
    public Silo getSilo() {
        return silo;
    }

    @Override
    public String toString() {
        return authTicket;
    }
}