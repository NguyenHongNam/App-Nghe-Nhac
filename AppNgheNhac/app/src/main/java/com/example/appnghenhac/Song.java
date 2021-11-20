package com.example.appnghenhac;

public class Song {
    private String SongName;
    private int File;

    public Song(String songName, int file) {
        SongName = songName;
        File = file;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public int getFile() {
        return File;
    }

    public void setFile(int file) {
        File = file;
    }
}
