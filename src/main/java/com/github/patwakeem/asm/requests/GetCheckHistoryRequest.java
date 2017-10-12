package com.github.patwakeem.asm.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetCheckHistoryRequest {
    private String fromUtc;
    private String toUtc;
    private int checkId;
}