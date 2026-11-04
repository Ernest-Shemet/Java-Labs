package org.example;

public class Main {
    public static void main(String[] args) {

        Track track1 = new Track("Song 1", "Artist 1", 180);
        Track track2 = new Track("Song 2", "Artist 2", 200);
        Track track3 = new Track("Song 3", "Artist 3", 240);
        Track track4 = new Track("Song 4", "Artist 4", 150);
        Track track5 = new Track("Song 5", "Artist 5", 210);
        Track track6 = new Track("Song 6", "Artist 6", 220);

        System.out.println("Средняя длительность: " + Track.getAverageDuration());
    }
}