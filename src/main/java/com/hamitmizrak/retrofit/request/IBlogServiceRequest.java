package com.hamitmizrak.retrofit.request;

import com.google.gson.JsonElement;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface IBlogServiceRequest {
    @GET("/api/v1/blog/list")
    Call<List<JsonElement>> blogList();
    @GET("/api/v1/blog/{id}")
    Call<JsonElement> blogFind(@Path("id") Long id);
    @POST("/api/v1/blog/add")
    Call<JsonElement> blogSave(@Body JsonElement jsonElement);
    @PUT("/api/v1/blog/{id}")
    Call<JsonElement> blogUpdate(@Path("id") Long id, JsonElement jsonElement);
    @DELETE("/api/v1/blog/{id}")
    Call<JsonElement> blogDelete(@Path("id") Long id);

}
