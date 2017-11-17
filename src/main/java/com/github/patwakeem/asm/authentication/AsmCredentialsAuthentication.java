package com.github.patwakeem.asm.authentication;

import com.github.patwakeem.asm.enumeration.Silo;

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

    @Override
    public String getAuthTicket() {
        return authTicket;
    }
}