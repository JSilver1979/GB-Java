package ru.GeekBrains.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    public static char[][] map;
    public static final int SIZE = 7;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = '0';
    public static Scanner console = new Scanner(System.in);
    public static Random randomNum = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true) {
            getHumanTurn();
            printMap();
            if (getWinConditions(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            getAITurn();
            printMap();
            if (getWinConditions(DOT_O)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void getHumanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y:");
            x = console.nextInt() - 1;
            y = console.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[x][y] = DOT_X;
    }

    public static boolean isCellValid (int x, int y) {
        if (x < 0 || x>= SIZE || y < 0 || y >= SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;

    }

    public static void getAITurn() {
        int x, y;
        do {
            x = randomNum.nextInt(SIZE);
            y = randomNum.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Ход компьютера: " + (x+1) + " " + (y+1));
        map[x][y] = DOT_O;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean getWinConditions(char checkDot) {
        int dotCountX;
        int dotCountY;
        int dotCountDiag;
        int dotCountBackDiag;
        for (int i = 0; i < SIZE; i++) {
            dotCountY = 0;
            dotCountX = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == checkDot) {
                    dotCountY++;
                    dotCountDiag = 0;
                    dotCountBackDiag = 0;
                    for (int k = 0; k < DOTS_TO_WIN; k++) {
                        if ((i + k) < SIZE && (j + k) < SIZE) {
                            if (map[i+k][j+k] == checkDot) dotCountDiag++;
                        }
                        if ((i + k) < SIZE && (j - k) >= 0) {
                            if (map[i+k][j-k] == checkDot) dotCountBackDiag++;
                        }
                    }
                    if (dotCountDiag == DOTS_TO_WIN) return true;
                    if (dotCountBackDiag == DOTS_TO_WIN) return true;
                }
                if (map[j][i] == checkDot) dotCountX++;
            }
            if (dotCountY == DOTS_TO_WIN) return true;
            if (dotCountX == DOTS_TO_WIN) return true;
        }
        return false;
    }
}
