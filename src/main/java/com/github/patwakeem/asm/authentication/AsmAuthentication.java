package com.github.patwakeem.asm.authentication;

import com.github.patwakeem.asm.enumeration.Silo;

public interface AsmAuthentication {
    Silo getSilo();

    String getAuthTicket();
}
