package ru.GeekBrains.Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp3 {
    public static void main(String[] args) {
//        simpleArray();
//        emptyArray();
//        doubleArray();
//        squareArray();
//        consoleInput();
//        minMaxArray(10);
//        sumArray(10);
        int[] arr = {1,2,3,4,5};
        moveArray(arr, -2);

    }
    //First Task
    public static void simpleArray() {
        int[] arr = {0,0,1,1,1,0,1,0,0,1,1,0,0,1,1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }

        System.out.println(Arrays.toString(arr));
    }
    //Second Task
    public static void emptyArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
    //Third Task
    public static void doubleArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    //Fourth Task
    public static void squareArray() {
        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }

                if (i+j == arr.length-1) {
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //Fifth Task
    public static void consoleInput() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int arrLen = console.nextInt();
        System.out.println("Введите начальное значение: ");
        int arrInitValue = console.nextInt();
        console.close();
        System.out.println(Arrays.toString(inputArray(arrLen,arrInitValue)));
    }
    public static int[] inputArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
    //Sixth Task
    public static int[] getRandomArray(int[] arr) {
        Random randomize = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomize.nextInt(arr.length);
        }
        return arr;
    }

    public static void minMaxArray(int arrLen) {
        int[] arr = new int[arrLen];
        int minIndex = arrLen;
        int maxIndex = 0;

        getRandomArray(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (minIndex > arr[i]) {
                minIndex = arr[i];
            }
            if (maxIndex < arr[i]) {
                maxIndex = arr[i];
            }
        }
        System.out.println("Min Number: " + minIndex + "; Max Number: " + maxIndex);
    }
    //Seventh Task
    public static void sumArray(int arrLen) {
        int[] arr = new int[arrLen];
        int leftSum = 0;
        int rightSum = 0;
        boolean isSumEqual = false;
        getRandomArray(arr);

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            rightSum = 0;
            for (int j = i+1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            System.out.println("Left: " + leftSum + " -  Right: " + rightSum);
            isSumEqual = (leftSum == rightSum)? isSumEqual = true: isSumEqual;
        }
        System.out.println(isSumEqual);
    }
    //Eighth Task
    public static void moveArray(int[] arr, int moveIndex) {
        int oldVar;
        int newVar;

        System.out.println(Arrays.toString(arr));
        System.out.println("Сдвиг на " + moveIndex + " позиций");

        if (moveIndex >= 0) {
            for (int i = 0; i < moveIndex; i++) {
                newVar = arr[arr.length - 1];
                for (int j = 0; j < arr.length; j++) {
                    oldVar = arr[j];
                    arr[j] = newVar;
                    newVar = oldVar;
                }
            }
        } else {
            for (int i = 0; i > moveIndex; i--) {
                newVar = arr[0];
                for (int j = arr.length - 1; j >= 0; j--) {
                    oldVar = arr[j];
                    arr[j] = newVar;
                    newVar = oldVar;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
