package com.github.patwakeem.asm.plainobjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import okhttp3.ResponseBody;
import retrofit2.Response;

import java.io.IOException;

@Getter
@AllArgsConstructor
public class RunCheckResult implements ResponseWrapper {

    private Response<ResponseBody> rawResponse;

    @Override
    public boolean isSuccessful() {
        try {
            return rawResponse.body().string().equals("");
        } catch (IOException e) {
            return false;
        }
    }
}