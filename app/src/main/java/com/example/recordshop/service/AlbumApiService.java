package com.example.recordshop.service;

import com.example.recordshop.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AlbumApiService {
        @GET("album/in-stock")
        Call<List<Album>> getAllAlbumsInStock();

        @POST("album")
        Call <Album> addAlbum(@Body Album album);
    }
