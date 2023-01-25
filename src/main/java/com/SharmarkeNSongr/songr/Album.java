package com.SharmarkeNSongr.songr;

public class Album {
    private String title;
    private String artist;
    private Integer songCount;
    private Double length;
    private String imgUrl;

    public Album(String title, String artist, Integer songCount, Double length, String imgUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    @Override
    public String toString() {
        return "Album Name: " + title + "from: " + artist + " has " + songCount + " songs. The length of the album in seconds is" + length + "seconds. Here is a link to the photo of the album" + imgUrl;}

}