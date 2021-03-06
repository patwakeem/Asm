package com.github.patwakeem.asm.plainobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.ResponseBody;
import retrofit2.Response;

@Getter
@AllArgsConstructor
public class DeleteGroupResult implements ResponseWrapper {

    private Response<ResponseBody> rawResponse;

    @Override
    public boolean isSuccessful() {
        return rawResponse.isSuccessful();
    }
}
