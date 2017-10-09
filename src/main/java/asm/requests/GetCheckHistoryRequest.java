package asm.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class GetCheckHistoryRequest {
    private String fromUtc;
    private String toUtc;
    private int checkId;
}
