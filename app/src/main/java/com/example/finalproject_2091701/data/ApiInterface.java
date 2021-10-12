package com.example.finalproject_2091701.data;

import com.example.finalproject_2091701.model.PlantModal;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("999bfb26-7102-4c11-8923-f6de74ea47c0")
    Call<PlantModal> getPlants();

}
