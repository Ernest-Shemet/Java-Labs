package org.example;

class Editor extends Software {
    private String fileFormat;

    public Editor(String name, String version, double price, String fileFormat) {
        super(name, version, price);
        this.fileFormat = fileFormat;
    }

    @Override
    public void install() {
        System.out.println("Установка редактора");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(super.name);
        System.out.println("Формат файлов: " + fileFormat);
    }

    public void saveFile() {
        System.out.println("Сохранение файла в формате " + fileFormat);
    }
}
