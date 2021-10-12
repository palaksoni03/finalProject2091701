package com.example.finalproject_2091701.ui.home;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.finalproject_2091701.data.Retrofit;
import com.example.finalproject_2091701.model.PlantModal;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    MutableLiveData<PlantModal> plantLiveData=new MutableLiveData<>();

    public void getPlants(){
        Retrofit.getInstance().getApi().getPlants().enqueue(new Callback<PlantModal>() {
            @Override
            public void onResponse(Call<PlantModal> call, Response<PlantModal> response) {
               plantLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<PlantModal> call, Throwable t) {
                Log.e("Error",t.toString());
            }
        });
    }

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}