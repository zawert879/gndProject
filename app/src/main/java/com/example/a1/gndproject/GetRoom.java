package com.example.a1.gndproject;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface GetRoom {
    @FormUrlEncoded
    @GET
    Call<Object>GetRoom(@FieldMap HashMap<String,String>PostDataParams);
}
