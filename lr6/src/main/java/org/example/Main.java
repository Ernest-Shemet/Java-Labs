package org.example;

public class Main {
    public static void main(String[] args) {
int count1=10;
        Phone phone = new Phone("яблоко", "айфон 17про", 5000);
        Phone phone2 =new Phone(10,"android","poco F5",1000 );

        phone.applyDiscount(15);

        System.out.println(phone.getPrice());
    }
}