package asm.client;

import asm.plainobjects.*;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Created by patrick on 11/25/16.
 * API Map for retrofit.
 */

interface AsmApiService {

    //    Check Calls
    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}")
    Call<AsmCheck> getCheck(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks")
    Call<List<AsmCheck>> getAllChecks(
            @Path("silo") int silo,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}/results")
    Call<List<AsmCheckDetailHistory>> getCheckHistory(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("fromUtc") String fromUtc,
            @Query("toUtc") String toUtc,
            @Query("detail_level") int detailLevel,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Checkws/{checkType}/locations")
    Call<List<AsmLocation>> getLocationsByCheckType(
            @Path("silo") int silo,
            @Path("checkType") String checkType,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/{checkId}/job")
    Call<ResponseBody> runCheck (
            @Path("silo") int silo,
            @Path("checkId") Integer checkId,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/{checkType}")
    Call<ResponseBody> createCheck (
            @Path("silo") int silo,
            @Path("checkType") String checkType,
            @Body JsonObject body,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @DELETE("https://api-wpm{silo}.apicasystem.com/v3/Checks/{id}")
    Call<ResponseBody> deleteCheck (
            @Path("silo") int silo,
            @Path("id") int checkId,
            @Query("auth_ticket") String authTicket
    );

    //    Result Calls
    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Checks/browser/{checkId}/results/urldata")
    Call<FprUrlResults> getFprUrlDetailsByResultId(
            @Path("silo") int silo,
            @Path("checkId") Integer checkId,
            @Body GetFprResultByIdBody resultByIdBody,
            @Query("auth_ticket") String authTicket
    );

    //    Group Calls
    @GET("https://api-wpm{silo}.apicasystem.com/v3/Groups")
    Call<List<AsmTopLevelGroup>> getGroups(
            @Path("silo") int silo,
            @Query("auth_ticket") String authTicket
    );

    @GET("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}/checks")
    Call<List<Integer>> getGroupChecks(
            @Path("silo") int silo,
            @Path("id") int id,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @POST("https://api-wpm{silo}.apicasystem.com/v3/Groups")
    Call<ResponseBody> createGroup(
            @Path("silo") int silo,
            @Body AddGroupBody agb,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @DELETE("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}")
    Call<ResponseBody> deleteGroup(
            @Path("silo") int silo,
            @Path("id") Integer id,
            @Query("auth_ticket") String authTicket
    );

    @Headers("Content-type: application/json")
    @PUT("https://api-wpm{silo}.apicasystem.com/v3/Groups/{id}")
    Call<ResponseBody> updateGroup(
            @Body AddGroupBody agb,
            @Path("silo") int silo,
            @Path("id") Integer id,
            @Query("auth_ticket") String authTicket
    );
}