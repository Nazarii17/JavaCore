package nazar.tkachuk.com.homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println("Enter 10 random elements, please.");
        Scanner scaner = new Scanner(System.in);

        for (int q = 0; q < arr.length; q++) {
            arr[q] = scaner.nextInt();
        }
        Integer[] arrayI = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.print("\nYou've filled the array.\nNow it looks like this:\n\n{ ");
        for (int f : arr) {
            System.out.print(f + " ");
        }
        System.out.print("}");
        Arrays.sort(arr);

        System.out.print("\n\nI've sorted the array from Min to Max.\nNow it looks like this:\n\n{ ");
        for (int f : arr) {
            System.out.print(f + " ");
        }
        System.out.print("}");

        int min = arr[0];
        System.out.println("\n\nThe minimal number is " + min);

        int max = arr[arr.length - 1];
        System.out.println("\nThe maximal number is " + max);

        Arrays.sort(arrayI, Collections.reverseOrder());
        System.out.print("\nI've sorted the array from Max to Min.\nNow it looks like this:\n\n{ ");
        for (int f : arrayI) {
            System.out.print(f + " ");
        }
        System.out.print("}");

        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }

        System.out.println("\n\nSum of all elements = " + sumTotal);

        int sumPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sumPositive += arr[i];
            }
        }
        System.out.println("\nSum of all positive elements = " + sumPositive);

        int sumNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sumNegative -= arr[i];
            }
        }
        System.out.println("\nSum of all negative elements = " + sumNegative);

        int amountPositive = 0;
        for (int a1 : arr) {
            if (a1 > 0) {
                amountPositive++;
            }
        }
        System.out.println("\nAmount of positive elements in array = " + amountPositive);

        int amountNegative = 0;
        for (int a2 : arr) {
            if (a2 < 0) {
                amountNegative++;
            }
        }
        System.out.println("\nAmount of negative elements in array = " + amountNegative);

        if (amountNegative > amountPositive) {
            System.out.println("\nArray has more negative elements than positive");
        } else System.out.println("\nArray has more positive elements than negative");
    }
}
