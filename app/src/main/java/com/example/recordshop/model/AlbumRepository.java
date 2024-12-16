package com.example.recordshop.model;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.example.recordshop.service.AlbumApiService;
import com.example.recordshop.service.RetrofitInstance;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class AlbumRepository {
    private MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public AlbumRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Album>> getMutableLiveData(){
        AlbumApiService albumApiService = RetrofitInstance.getService();
        Call<List<Album>> call =albumApiService.getAllAlbumsInStock();
        call.enqueue(new Callback<List<Album>> () {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>>  response) {
                List<Album> albums = response.body();
                mutableLiveData.setValue(albums);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {
                Log.i("GET Request", t.getMessage());

            }
    });
        return  mutableLiveData;
}
}
