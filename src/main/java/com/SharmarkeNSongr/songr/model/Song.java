package com.SharmarkeNSongr.songr.model;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String title;
    private Double length;
    private Integer trackNumber;
    @ManyToOne
    private Album songAppearing;

    protected Song() {}

    public Song(String title, Double length, Integer trackNumber, Album songAppearing) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.songAppearing = songAppearing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getSongAppearing() {
        return songAppearing;
    }

    public void setSongAppearing(Album songAppearing) {
        this.songAppearing = songAppearing;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                ", songAppearing=" + songAppearing +
                '}';
    }
}
