package com.github.patwakeem.asm.reactive;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class ReactiveAsmApi {

    private static ReactiveAsmApiService REST_CLIENT;
    private static final String API_URL = "https://api-wpm.apicasystem.com/v3/";

    static {
        setupRestClient();
    }

    private ReactiveAsmApi() {
    }

    public static ReactiveAsmApiService get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {

        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(client)
                .build();

        REST_CLIENT = retrofit.create(ReactiveAsmApiService.class);
    }
}