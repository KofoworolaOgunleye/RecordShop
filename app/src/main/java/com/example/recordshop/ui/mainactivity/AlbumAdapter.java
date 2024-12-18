package com.example.recordshop.ui.mainactivity;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recordshop.R;
import com.example.recordshop.databinding.AlbumBinding;
import com.example.recordshop.model.Album;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private ArrayList<Album> albumList;
    public AlbumAdapter(ArrayList<Album> albumList){
        this.albumList = albumList;
    }


    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AlbumBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.album,
                parent,
                false
        );
        return new AlbumViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album album=albumList.get(position);
        holder.albumBinding.setAlbum(album);
    }

    @Override
    public int getItemCount() {
        if (albumList == null || albumList.isEmpty()) {
            Log.d("LIST_CHECK", "The album list is empty.");
        } else {
            Log.d("LIST_CHECK", "The album list has data. Size: " + albumList.size());
        }
        return albumList.size();
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder{
        private AlbumBinding albumBinding;
        public AlbumViewHolder(AlbumBinding albumBinding) {

            super(albumBinding.getRoot());
            this.albumBinding = albumBinding;
        }
    }
}
