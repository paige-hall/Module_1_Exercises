package com.techelevator;

public class Movie extends MediaItem{
    private String rating;
    private int runLength;

    public Movie(String title, String rating, int runLength, double price) {
        this.title = title;
        this.rating = rating;
        this.runLength = runLength;
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }
}
