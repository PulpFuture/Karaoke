package com.teamtreehouse.model;

public class SongRequest {
    private String mSingerName;
    private Song mSong;

    public SongRequest(String singerName, Song song) {
        mSingerName = singerName;
        mSong = song;
    }
}
