package ru.GeekBrains.Lesson5;

import javax.naming.PartialResultException;

public class HomeWorkApp5 {


    public static void main(String[] args) {
        Employee worker;
        worker = new Employee(
                "John Galt",
                "Engineer",
                "john.galt@somecompany.com",
                "+7(2548)55-77-88",
                50_000.0,
                32);
        worker.getInfo();

        Employee[] staff = new Employee[5];
        setStaffArray(staff);
        searchStaffByAge(staff, 40);
    }

    private static Employee[] setStaffArray(Employee[] arr) {
        arr[0] = new Employee(
                "John Galt",
                "Engineer",
                "john.galt@somecompany.com",
                "+7(2548)55-77-88",
                50_000.0,
                32);
        arr[1] = new Employee(
                "Frank Riarden",
                "Director",
                "frank.riarden@somecompany.com",
                "+7(2548)55-77-88",
                100_000.0,
                41);
        arr[2] = new Employee(
                "Chandler Bing",
                "PR Manager",
                "chandler.bing@somecompany.com",
                "+7(2548)55-77-88",
                70_000.0,
                45);
        arr[3] = new Employee(
                "Phoebe Buffe",
                "Secretary",
                "phoebe.buffe@somecompany.com",
                "+7(2548)55-77-88",
                40_000.0,
                21);
        arr[4] = new Employee(
                "Joe Tribbiani",
                "Driver",
                "joe.tribbiani@somecompany.com",
                "+7(2548)55-77-88",
                30_000.0,
                40);
        return arr;
    }

    private static void searchStaffByAge(Employee[] arr,int age) {
        System.out.println("Searching staff over " + age + " age");
        System.out.println("----------------------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > age) arr[i].getInfo();
        }
    }
}
