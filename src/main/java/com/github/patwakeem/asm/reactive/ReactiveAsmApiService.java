package com.github.patwakeem.asm.reactive;

import com.github.patwakeem.asm.plainobjects.*;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.*;

import java.util.List;

public interface ReactiveAsmApiService {

    //    Check Calls
    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}")
    Observable<List<AsmCheck>> getChecks(
            @Path("silo") int silo,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}")
    Observable<AsmCheck> getCheck(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}/results")
    Observable<List<AsmCheckDetailHistory>> getCheckHistory(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("fromUtc") String fromUtc,
            @Query("toUtc") String toUtc,
            @Query("detail_level") int detailLevel,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{checkType}/locations")
    Observable<List<AsmLocation>> getLocationsByCheckType(
            @Path("silo") int silo,
            @Path("checkType") String checkType,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/{checkId}/job")
    Observable<ResponseBody> runCheck(
            @Path("silo") int silo,
            @Path("checkId") Integer checkId,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/{checkType}")
    Observable<ResponseBody> createCheck(
            @Path("silo") int silo,
            @Path("checkType") String checkType,
            @Body JsonObject body,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @DELETE("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}")
    Observable<ResponseBody> deleteCheck(
            @Path("silo") int silo,
            @Path("id") int checkId,
            @Query("auth_ticket") String authTicket
    );

    //    Screenshots
    @Headers("Content-type: application/json")
    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/browser/{checkId}/results/{resultId}/screenshots")
    Observable<List<ScreenshotMetaData>> getScreenshotMetaDataByResultId(
            @Path("silo") int silo,
            @Path("checkId") Integer checkId,
            @Path("resultId") String resultId,
            @Query("auth_ticket") String authTicket
    );

    //    Result Calls
    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/browser/{checkId}/results/urldata")
    Observable<FprUrlResults> getFprUrlDetailsByResultId(
            @Path("silo") int silo,
            @Path("checkId") Integer checkId,
            @Body GetFprResultByIdBody resultByIdBody,
            @Query("auth_ticket") String authTicket
    );

    //    Group Calls
    @GET("https://api-wpm{silo}.apicasystem.com/v3/Groups")
    Observable<List<AsmTopLevelGroup>> getGroups(
            @Path("silo") int silo,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}/checks")
    Observable<List<Integer>> getGroupChecks(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Groups")
    Observable<ResponseBody> createGroup(
            @Path("silo") int silo,
            @Body AddGroupBody agb,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @DELETE("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}")
    Observable<ResponseBody> deleteGroup(
            @Path("silo") int silo,
            @Path("id") Integer id,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @PUT("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}")
    Observable<ResponseBody> updateGroup(
            @Body AddGroupBody agb,
            @Path("silo") int silo,
            @Path("id") Integer id,
            @Query("auth_ticket") String authTicket
    );
}
