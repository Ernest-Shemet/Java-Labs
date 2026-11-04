package org.example;

class Game {
    String title;
    String genre;
    int rating;

    Game(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
public String toString(){
        return title+" "+genre+" "+ rating;
}
    boolean isTop() {
        return rating >= 9;
    }
}
