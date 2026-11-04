package org.example;

class Track {
    String title;
    String artist;
    int duration;

    static int totalTracks = 0;
    static int totalDuration = 0;

    Track(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;

        totalTracks++;
        totalDuration += duration;
    }

    static double getAverageDuration() {
        return (double) totalDuration / totalTracks;
    }
}
