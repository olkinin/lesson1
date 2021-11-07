package ru.geekbrains.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Crosses {
    public static final char dot_x = 'X';
    public static final char dot_O = 'O';
    public static final char dot_empty = '*';
    public static int size = 3;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random(size);
    public static char[][] arr = new char[size][size];
    public static int lenWin = 3;

    public static void main(String[] args) {

        initArrFull();
        printArr();
        while (true) {
            checkHuman();
            printArr();
            if (checkToWin(dot_x)) {
                System.out.println(" Вы победили!");
                break;
            }
            if (fullFilled()) {
                System.out.println("Ничья");
                break;
            }
            checkAi();
            printArr();
            if (checkToWin(dot_O)) {
                System.out.println(" Вы победили!");
                break;
            }
            if (fullFilled()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initArrFull() {
        arr = new char[size][size];
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                arr[y][x] = dot_empty;
            }
        }
    }

    public static void printArr() {
        for (int i = 0; i < size + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int x = 0; x < size; x++) {
            System.out.print(x + 1 + " ");
            for (int y = 0; y < size; y++) {
                System.out.print(arr[x][y] + " ");

            }
            System.out.println();
        }
    }

    public static boolean inValidFull(int x, int y) {

        if (x >= 0 && x < size && y >= 0 && y < size && arr[y][x] == dot_empty) {
            return true;
        }
        return false;
    }


    public static void checkHuman() {
        int x;
        int y;

        do {
            System.out.println("Введите координаты x и y через пробел");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;

        } while (!inValidFull(x, y));
        arr[y][x] = dot_x;
    }


    public static void checkAi() {
        int x;
        int y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!inValidFull(x, y));
        arr[y][x] = dot_O;
    }

    public static boolean fullFilled() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (arr[y][x] == dot_empty) {
                    return false;
                }
            }

        }
        return true;
    }
   public static boolean checkToWin(char dot){
        if (arr[0][0] == dot && arr[0][1] == dot && arr[0][2] == dot) return true;
        if (arr[1][0] == dot && arr[1][1] == dot && arr[1][2] == dot) return true;
        if (arr[2][0] == dot && arr[2][1] == dot && arr[2][2] == dot) return true;
       if (arr[0][0] == dot && arr[1][0] == dot && arr[2][0] == dot) return true;
        if (arr[0][1] == dot && arr[1][1] == dot && arr[2][1] == dot) return true;
        if (arr[0][2] == dot && arr[1][2] == dot && arr[2][2] == dot) return true;
        if (arr[0][0] == dot && arr[1][1] == dot && arr[2][2] == dot) return true;
        if (arr[0][2] == dot && arr[1][1] == dot && arr[2][0] == dot) return true;
        return false;
}
/*Здесь мои неудавшиеся попытки усовершенствовать проверку побед...
 Была бы весьма признательна, если бы Вы объяснили где я ошиблась
 и как этот код сделаь рабочим, если это возможно*/

    /*public static boolean checkToWin(char dot) {
        int k;
               int i = 0;
        int j = 0;
        for (i = 0; i < size-1; i++) {
            for (int y = 0; y < size; y++) {
                if (arr[i][y] == dot) {
                    for (j = 0; j < lenWin - 1; j++) {
                        if (arr[i][j] == dot);
                    }


                }return true;
            }
        }return false;
    }
    public static boolean checkToWin(char dot) {
        boolean result=false;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size; j++) {
           if (arr[j][i] == dot) {
              checkToWinVer(dot);checkToWinDia(dot);checkToWinHor(dot);
          }}} return result;}


    public static boolean checkToWinVer(char dot) {
        int y=0;
        boolean result=false;
        for (int x = 0; x < lenWin; x++) {
            for (y = 0; y < lenWin; y++); {
                if (arr[y][x] != dot);break;

            }
        }
            return result;

            }

    public static boolean checkToWinDia(char dot) {
        for (int x = 0; x < lenWin; x++) {
            for (int y = 0; y < lenWin; y++) {
                if(x==y&&arr[y][x]==dot);}return true;}return false;
        }
    public static boolean checkToWinHor(char dot) {
        for (int x = 0; x < lenWin; ) {
            for (int y = 0; y < lenWin; y++){
                if(arr[y][x]==dot);x++;}return true;}return false;
    }*/
}


















