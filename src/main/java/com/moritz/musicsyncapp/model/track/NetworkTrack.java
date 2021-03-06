package com.moritz.musicsyncapp.model.track;

public class NetworkTrack implements ITrack{

    private String name;
    private String artist;
    private String uri;
    private int duration;

    public NetworkTrack(String name, String artist, String uri, int duration) {
        this.name = name;
        this.artist = artist;
        this.uri = uri;
        this.duration = duration;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public String getUri() {
        return uri;
    }

    @Override
    public int getDuration() {
        return duration;
    }
}
