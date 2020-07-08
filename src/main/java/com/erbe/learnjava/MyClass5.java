package com.erbe.learnjava;

public class MyClass5 {

    public static void main(String[] args) {

        int a = 12;
        String myString = "Hello there";
        boolean isEmpty = myString.isEmpty();
        boolean contains = myString.contains("h");

        if (contains) {
            System.out.println("Yes contain h");
        } else {
            System.out.println("No H");
        }

        if (!isEmpty) {
            System.out.println(myString);
        } else {
            System.out.println("Empty");
        }

        // Person james = new Person();
        Person james = new Person("James", "Bond", 22);

        System.out.println(james.getFirstName());

        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setAge(22);
        employee.setId(1);
        employee.setAnnualSalary(1000);

        System.out.println(employee.getId());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getFirstName());

        Manager manager = new Manager();
        manager.setFirstName("George");
        manager.setLastName("Kilos");
        manager.setAge(22);
        manager.setId(2);
        manager.setAnnualSalary(2000);

        System.out.println(manager.getId());
        System.out.println(manager.getAnnualSalary());
        System.out.println(manager.getFirstName());

        System.out.println(manager);
    }
}
