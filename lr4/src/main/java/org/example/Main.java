package org.example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game("Minecraft", "Sandbox", 9);
        System.out.println(game.isTop());
        System.out.println(game);
        Lake[] lakes = new Lake[5];
        lakes[0] = new Lake("Байкал", 1000, 3122);
        lakes[1] = new Lake("Нарочь", 24, 79);
        lakes[2] = new Lake("Свирь", 8, 22);
        lakes[3] = new Lake("Освейское", 7, 52);
        lakes[4] = new Lake("Лукомское", 11, 36);
        Lake deepest = lakes[0];
        Lake biggest = lakes[0];
        for (int i = 1; i < lakes.length; i++) {
            if (lakes[i].depth > deepest.depth) {
                deepest = lakes[i];
            }
            if (lakes[i].area > biggest.area) {
                biggest = lakes[i];
            }
        }
        System.out.println("Самое глубокое озеро: " + deepest.name);
        System.out.println("Озеро с максимальной площадью: " + biggest.name);
        Trip[] trips = new Trip[6];
        trips[0] = new Trip("Москва", Transport.TRAIN);
        trips[1] = new Trip("Варшава", Transport.BUS);
        trips[2] = new Trip("Париж", Transport.PLANE);
        trips[3] = new Trip("Гродно", Transport.TRAIN);
        trips[4] = new Trip("Минск", Transport.CAR);
        trips[5] = new Trip("Брест", Transport.TRAIN);
        for (int i = 0; i < trips.length; i++) {
            if (trips[i].transport == Transport.TRAIN) {
                System.out.println(trips[i].destination);
            }
        }
    }
}