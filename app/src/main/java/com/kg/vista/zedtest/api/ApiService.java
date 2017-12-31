package com.kg.vista.zedtest.api;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("/v2/5a488f243000004c15c3c57e")
    Call<ResponseBody> getMockyData();

}
