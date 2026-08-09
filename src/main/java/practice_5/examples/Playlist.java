package practice_5.examples;

import practice_5.Transport;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Track> tracks = new ArrayList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }
}
