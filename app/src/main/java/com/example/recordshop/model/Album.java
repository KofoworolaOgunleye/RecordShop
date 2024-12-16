package com.example.recordshop.model;

public class Album {
    Long id;
    String name;
    String description;
    String artist;
    String genre;
    int releaseYear;
    int stockQuantity;

    public Album() {
    }

    public Album(Long id, String name, String description, String artist, String genre, int releaseYear, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.artist = artist;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.stockQuantity = stockQuantity;
    }
}
