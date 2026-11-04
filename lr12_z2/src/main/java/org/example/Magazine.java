package org.example;
import java.util.List;
class Magazine {
    int id;
    String title;
    String category;
    int rating;
    List<Integer> readerRatings;
    Magazine(int id, String title, String category, int rating, List<Integer> readerRatings) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.rating = rating;
        this.readerRatings = readerRatings;
    }
    double getAverageRating() {
        if (readerRatings.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int r : readerRatings) {
            sum += r;
        }
        return (double) sum / readerRatings.size();
    }
    int getRating() {
        return rating;
    }
    void setRating(int rating) {
        this.rating = rating;
    }
}
