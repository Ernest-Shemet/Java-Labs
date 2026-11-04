package org.example;


public class Main {
    public static void main(String[] args) {

        Software[] programs = new Software[6];

        programs[0] = new Game("Minecraft", "1.20", 30, "Песочница");
        programs[1] = new Game("GTA V", "1.0", 60, "Экшен");
        programs[2] = new Game("CS2", "2.0", 0, "Шутер");
        programs[3] = new Editor("Photoshop", "2025", 50, "PSD");
        programs[4] = new Editor("Word", "2024", 20, "DOCX");
        programs[5] = new Editor("DOTA2", "2025", 50, "DOCX");

        for (Software program : programs) {

            System.out.println("-");

            program.displayInfo();
            program.install();

            if (program instanceof Game) {
                Game game = (Game) program;
                game.launch();
            }

            if (program instanceof Editor) {
                Editor editor = (Editor) program;
                editor.saveFile();


            }
        }
    }
}