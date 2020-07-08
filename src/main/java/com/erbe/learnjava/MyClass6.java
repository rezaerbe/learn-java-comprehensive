package com.erbe.learnjava;

import java.util.ArrayList;

public class MyClass6 {

    public static void main(String[] args) {

        int[] myArray = {1,2,3,4};
        String[] names = {"James", "Anthony", "Rodrigo", "Niraj"};

        int[] newArray = new int[4];
        String[] newNames = new String[5];

        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;
        newArray[3] = 4;

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Items: " + newArray[i]);
        }

        // System.out.println(names[3]);

        // ArrayList<String> name = new ArrayList<>();
        ArrayList name = new ArrayList();
        name.add("James");
        name.add("Bond");
        name.add("Bonni");
        name.add("Arnold");

        for (int i = 0; i < name.size(); i++) {
            System.out.println("Names: " + name.get(i));
        }

        for (Object n: name) {
            System.out.println("Names: " + n);
        }

        // System.out.println(name.get(0));

    }
}
