package ru.GeekBrains.Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkNums(2,11));
        checkNums(-657);
        System.out.println(checkFalseNums(23));
        printStrings("This is second homework", 3);
        System.out.println(leapYear(2000));

    }
    //First Task
    public static boolean checkNums(int firstNum, int secondNum) {
        int sum = firstNum + secondNum;
        return sum >=10 && sum <=20;
    }
    //Second Task
    public static void checkNums(int number) {
        if (number < 0) {
            System.out.println(number + " - Отрицательное число");
        } else {
            System.out.println(number + " - Положительное число");
        }
    }
    //Third Task
    public static boolean checkFalseNums(int number) {
        return number < 0;
    }
    //Fourth Task
    public static void printStrings(String text,int numRows) {
        for (int i = 0; i < numRows; i++) {
            System.out.println(text);
        }

    }
    //Fifth Task
    public static boolean leapYear(int year) {
        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else {
            isLeap = year % 4 == 0;
        }
        return isLeap;
    }

}
