package org.example;

class Hammer implements Useful, Repairable, Test {
    String name;
    double weight;
    boolean broken;
    boolean test;

    Hammer(String name, double weight, boolean broken, boolean test) {
        this.name = name;
        this.weight = weight;
        this.broken = broken;
        this.test = test;
    }
    public void test(){
        if(test){
            System.out.println(test + " непротестирована");}
        else{
            System.out.println(test + " протестирована");
        }}
    public void use() {
        if (broken) {
            System.out.println(name + " сломан");
        } else {
            System.out.println(name + " забивает гвозди");
        }
    }
    public String getPurpose() {
        return "Забивание гвоздей";
    }
    public void repair() {
        broken = false;
        System.out.println(name + " отремонтирован");
    }
    public boolean isBroken() {
        return broken;
    }
    public boolean isTest() {
        return test;
    }
}
