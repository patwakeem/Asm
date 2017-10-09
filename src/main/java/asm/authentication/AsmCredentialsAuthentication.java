package asm.authentication;

import asm.plainobjects.Silo;

public class AsmCredentialsAuthentication implements AsmAuthentication {

    private String authTicket;
    private Silo silo;

    public AsmCredentialsAuthentication(String authTicket, Silo silo) {
        this.authTicket = authTicket;
        this.silo = silo;
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
