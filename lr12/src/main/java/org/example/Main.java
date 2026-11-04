
package org.example;

import java.util.HashMap;
import java.util.Map;
//import java.util.TreeMap;
import java.util.Iterator;

public class
Main {
    public static void main(String[] args) {

       Map<String, Animal> animals = new HashMap<>();
       //Map<String, Animal> animals = new TreeMap<>();

        animals.put("Лев", new Mammal("Лев", 1, "Саванна", true));
        animals.put("Слон", new Mammal("Слон", 2, "Саванна", false));
        animals.put("Медведь", new Mammal("Медведь", 3, "Лес", true));
        animals.put("Краб", new Fish("Краб",9,"Озеро",9) );
        animals.put("Змея", new Reptile("Змея", 4, "Пустыня", true));
        animals.put("Крокодил", new Reptile("Крокодил", 5, "Река", true));
        animals.put("Черепаха", new Reptile("Черепаха", 6, "Озеро", true));

        animals.put("Акула", new Fish("Акула", 7, "Океан", 8));
        animals.put("Карп", new Fish("Карп", 8, "Озеро", 7));
        animals.remove("Краб");
        animals.get("акула");
        animals.size();
        animals.containsKey("Карп");
        System.out.println("Животные по алфавиту:");

       /* Iterator<Map.Entry<String, Animal>> iterator = animals.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Animal> entry = iterator.next();

            System.out.println("Ключ: " + entry.getKey());
            System.out.println("Значение: " + entry.getValue());
            System.out.println();
        }*/
        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Animal> entry : animals.entrySet()) {
            System.out.println("Ключ: " + entry.getKey());
            System.out.println("Значение: " + entry.getValue());
            System.out.println();
        }
    }
}
