package ru.GeekBrains.Lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("     EMPLOYEE INFO");
        System.out.println("------------------------");
        System.out.println("    Name: " + fullName);
        System.out.println("     Age: " + age);
        System.out.println("Position: " + position);
        System.out.println("   Email: " + email);
        System.out.println("   Phone: " + phone);
        System.out.println("  Salary: " + salary);
        System.out.println("------------------------");
        System.out.println();

    }
    public int getAge () {
        return age;
    }
}
