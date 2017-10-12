package com.github.patwakeem.asm.plainobjects;

import okhttp3.ResponseBody;
import retrofit2.Response;

public interface ResponseWrapper {

    boolean isSuccessful();
    Response<ResponseBody> getRawResponse();
}
