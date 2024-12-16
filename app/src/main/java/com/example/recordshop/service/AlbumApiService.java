package com.example.recordshop.service;

import com.example.recordshop.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface AlbumApiService {
        @GET("/album")
        Call<List<Album>> listRepos(@Path("user") String user);
    }
