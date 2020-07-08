package com.erbe.learnjava;

public class MyClass3 {

    public static void main(String[] args) {

        /*
            Long
            Comment
            Area
         */

//        // Variable == bucket in memory
//        long l = 64;    // 64 bit
//        int age = 32;   // 32 bit
//        short s = 16;   // 16 bit
//        byte b = 8;     // 8 bit
//
//        // decimal numbers
//        float pi = 3.14f;
//        // bigger with more precision
//        double pid = 3.14;
//
//        String name = "John";
//        char a = 'a';
//
//        // boolean = true or false, 1 or 0
//        boolean isTrue;
//        isTrue = true;
//
//        System.out.println("My name is " + name + " and I'm " + age + " years old.");


//        int a = 12;
//        int b = 13;
//        double c = 14.0;
//
//        int add = a + b;
//        int sub = a - b;
//        int mul = a * b;
//        int div = a / b;
//
//        // Casting
//        int add1 = (int) (a + c);
//        int sub1 = (int) (a - c);
//        double mul1 = (a * c);
//        double div1 = (a / c);
//
//        // add = add + 100;
//        add += 100;
//
//        System.out.println("The total is " + add);


//        // Control flow - Introduction
//        // if statements
//        /*
//            === Relational Operators ===
//
//            = --> Assignment
//            == --> Comparison
//            !+ --> Not
//            > --> Greater than
//            < --> Less than
//            >= --> Greater than or equal
//            <= --> Less than or equal
//
//            === Logical Operators ===
//
//            AND --> &&  : returns false if one is false
//            OR --> ||   : returns true if one side is true
//            ! -- Negation
//         */
//
//        double firstAge = 21;
//        double secondAge = 17;
//        boolean isAged = true;
//        boolean isNotAged = false;
//
//        if ((isAged || isNotAged) && (firstAge > 12)) {
//            System.out.println("Can beat bear!");
//        } else {
//            System.out.println("Not allowed to beat bear!");
//        }


//        for (int i = 0; i < 10; i++) {
//            // will run this code here
//            if (i % 3 == 0){
//                System.out.println(i + " is multiple of 3");
//            }
//        }


//         String bio = showBio("John", "I was born on Earth", 22);
//         System.out.println(bio);
//         System.out.println(divideNumbers(4.0, 2.0));
//         multiplyNumbers(2.0, 4.0);
//         addNumbers(12, 22);
//         anotherMethod("Hello", 22);
//         showName();

    }

    public static String showBio(String name, String bio, int age) {
        return " My name is " + name
                + " and I am " + age + " years old."
                + " " + bio;
    }

    public static double divideNumbers(double a, double b) {
        return (a/b);
    }

    public static void multiplyNumbers(double a, double b) {
        System.out.println("Result: " + a*b);
    }

    public static void addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }

    public static void anotherMethod(String something, int age) {
        if (age < 90) {
            System.out.println("I am still young");
        }
        System.out.println("Another Method " + something + " " + age);
    }

    public static void showName() {
        System.out.println("From ShowName");
    }
}