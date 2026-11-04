package org.example;

class Screwdriver implements Useful, Repairable,Test {
    String name;
    int size;
    boolean broken;
    boolean test;

    Screwdriver(String name, int size, boolean broken, boolean test) {
        this.name = name;
        this.size = size;
        this.broken = broken;
        this.test = test;
    }

    public void test(){
        if(test){
            System.out.println(test + " непротестирована");}
            else{
            System.out.println(test + " протестирована");
        }

    }

    public void use() {
        if (broken) {
            System.out.println(name + " сломана");
        } else {
            System.out.println(name + " закручивает винты");
        }
    }
    public String getPurpose() {
        return "Закручивание винтов";
    }
    public void repair() {
        broken = false;
        System.out.println(name + " отремонтирована");
    }
    public boolean isBroken() {
        return broken;
    }
    public boolean isTest() {
        return test;
    }
}
