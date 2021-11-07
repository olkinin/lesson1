package ru.geekbrains.lesson3.homework3;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArray {


    public static void main(String[] arg) {
        invertArray();
        arrayEmpty();
        increaseInNumbers();
        twoDimensionalArray();
        arrayWithArguments(5, 3);
        maxMinElements();
        shiftedToTheRight();
        System.out.println(checkBalanse());
        additionalTask();
    }


    //Задание 1
    public static void invertArray() {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.print(Arrays.toString(arr));

    }

    //Задание 2
    public static void arrayEmpty() {
        int[] arr1 = new int[100];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i] = i;

        }
        System.out.print(Arrays.toString(arr1));
    }

    //Задание 3
    public static void increaseInNumbers() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] *= 2;
            }
        }

        System.out.print(Arrays.toString(arr2));
    }


    //Задание 4
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print((arr[i][j] + " "));
            }
            System.out.println();
        }
    }

    public static void twoDimensionalArray() {
        int[][] arr3 = new int[10][10];

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (j == i || ((i + j) == arr3.length - 1)) {
                    arr3[i][j] = 1;
                } else {
                    arr3[i][j] = 0;
                }
            }


        }
        printArray(arr3);


    }

    //Задание 5
    public static int arrayWithArguments(int len, int initialValue) {
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            arr5[i] = initialValue;
        }
        System.out.print(Arrays.toString(arr5));
        return arr5[initialValue];


    }

    //Задание 6
    public static void maxMinElements() {
        int[] arr6 = {100, 220, 8, 5, 100, 1, 235, 118};
        Arrays.sort(arr6);
        int last = arr6.length;
        System.out.println("Минимальный элемент" + " " + arr6[0]);
        System.out.println("Максимальный элемент" + " " + arr6[last - 1]);


    }

    //Задание 7
    public static void shiftedToTheRight() {
        int[] arr7 = {3, 2, 1, 4, 5, 6, 7, 8};
        int n = 2;
        int i = 0;
        for (i = 0; i < arr7.length - n; i++) {
            arr7[i] = arr7[i + n];
            if (i == arr7.length - n) {
                i = 0;
                for (int j = 0; j < 1; j++) {
                    arr7[i] = arr7[j];
                }
            }
        }


        System.out.print(Arrays.toString(arr7));
    }

    //Задание 8
    public static boolean checkBalanse() {
        int[] array = {5, 1, 3, 4, 1, 4};
        int n = 0;
        int sum = 0;
        int sum1 = 0;
        int k = array.length;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        while (sum != sum1 && n < k) {
            k--;
            sum -= array[k];
            sum1 += array[k];
        }
        if (sum == sum1) {
            //  System.out.println(true);
            return true;
        } else {
            //.out.println(false);
            return false;
        }

    }

    //Дополнительное задание
    public static void additionalTask() {
        String[] arr8 = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        int n = (int) (Math.random() * 24);
        String str = arr8[n];
        System.out.println(arr8[n]);
        comparison(str);
    }

    public static void comparison(String str) {
        Scanner sc = new Scanner(System.in);
        int b = str.length();
        System.out.println("Введите слово");
        String word = sc.next();
        for (int i = 0; i < b; i++) {
            if (word.charAt(i) == str.charAt(i)) {
                System.out.print(str.charAt(i));
            } else {
                System.out.print("#");
            }
        }
        for (int j = 0; j < (15 - b); j++) {
            System.out.print("#");
        }
        System.out.println();
        if (word.equals(str)) {
            System.out.println("Вы угадали");
        } else {
            comparison(str);
        }

    }


}








































