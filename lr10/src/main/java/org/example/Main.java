
package org.example;

public class Main {
    public static void main(String[] args) {

        Useful[] tools = {
                new Hammer("Молоток 1", 1.5, false,true),
                new Hammer("Молоток 2", 2.0, true,false),
                new Hammer("Молоток 3", 1.0, false,true),
                new Screwdriver("Отвертка 1", 5, true,false),
                new Screwdriver("Отвертка 2", 8, false,true),
        };

        for (int i = 0; i < tools.length; i++) {
            System.out.println(tools[i].getPurpose());
            tools[i].use();
            Repairable tool = (Repairable) tools[i];
            if (tool.isBroken()) {
                tool.repair();
                tools[i].use();
            }

            Test tester = (Test) tools[i];

            if (tester.isTest()) {
                tester.test();
            }

            System.out.println();
        }
    }
}
