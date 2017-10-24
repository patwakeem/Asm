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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AsmCredentialsAuthentication that = (AsmCredentialsAuthentication) o;

        if (authTicket != null ? !authTicket.equals(that.authTicket) : that.authTicket != null) return false;
        return silo == that.silo;
    }

    @Override
    public int hashCode() {
        int result = authTicket != null ? authTicket.hashCode() : 0;
        result = 31 * result + (silo != null ? silo.hashCode() : 0);
        return result;
    }
}