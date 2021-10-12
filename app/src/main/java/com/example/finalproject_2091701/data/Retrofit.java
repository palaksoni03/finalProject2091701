package com.example.finalproject_2091701.data;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private retrofit2.Retrofit retrofit;
    private final String BASE_URL = "https://run.mocky.io/v3/";

    static Retrofit obj;

    public Retrofit() {
        createRetrofitInstance();
    }

    public static Retrofit getInstance() {
        if (obj == null) {
            obj = new Retrofit();

            return obj;
        }
        return obj;
    }

    public void createRetrofitInstance() {

        retrofit = new retrofit2.Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


    }

    public ApiInterface getApi() {
        return retrofit.create(ApiInterface.class);
    }
}
