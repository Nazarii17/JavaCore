package nazar.tkachuk.com.homework;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String phrase1 = "Enter the ";

////// Task 3

        int number1;
        String phrase3 = "Your number is ";
        System.out.println("To start enter \"GO\"\nTo finish enter \"END\"");
        String choice1 = scaner.nextLine().toLowerCase();
        while (choice1.equals("go")) {
            System.out.println(phrase1 + "random number (any positive or negative number).");
            number1 = scaner.nextInt();
            System.out.println("You entered " + number1);

            if (number1 > 0) {
                System.out.println(phrase3 + "positive.");
            } else if (number1 < 0) {
                System.out.println(phrase3 + "negative.");
            } else {
                System.out.println("Invalid number. Please try again");
            }

            System.out.println("\nTo start enter \"GO\"\nTo finish enter \"END\"");
            choice1 = scaner.next();

        }
        System.out.println("\nThe end\n");

// Task 1

        String phrase2 = "Now 'n' = ";
        int n;

        for (int i = 0; i < 3; i++) {
            System.out.println(phrase1 + "m (any positive or negative number, don't forget about zero.)");
            int m = scaner.nextInt();
            if (m > 0) {
                n = 1;
                System.out.println(phrase2 + n);
            } else if (m == 0) {
                n = 0;
                System.out.println(phrase2 + n);
            } else {
                n = -1;
                System.out.println(phrase2 + n);
            }
        }
        System.out.println("The end.\n");

//////// Task 2

        int anyNumber = 1;

        while (anyNumber != 0) {
            System.out.println("To start, enter any number\nTo finish enter \"0\"");
            anyNumber = scaner.nextInt();
            if (anyNumber % 2 == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        }
        System.out.println("You entered \"0\", to end the program.\n");

////// Task 4

        int y = 0, z = 1;
        System.out.println("Choose a number please.\nP.S. 10 is always a great choice.");
        int userNum = scaner.nextInt();
        for (int i = 1; i < userNum + 1; i++) {
            y = i + y;
            z = i * z;
        }
        System.out.println("The sum of first " + userNum + " natural numbers = " + y);
        if (z != 0) {
            System.out.println("The product of first " + userNum + " natural numbers = " + z);
        }
        System.out.println("The product of first " + userNum + " natural numbers = 0");

////// Task 5

        System.out.println(phrase1 + "any number to create a triangle");
        int size = scaner.nextInt();

        for (int starX = 1; starX <= size; starX++) {
            for (int starY = 1; starY <= size; starY++) {
                if (starY <= starX && starX % 2 != 0)
                    System.out.print(" *");
            }
            System.out.println(" ");
        }
        System.out.println("\n\n\n");

////HW Task2

        System.out.println(phrase1 + "number to create a triangle");

        int num = scaner.nextInt();
        for (int u = 1; u <= num; u++) {

            for (int j = num; j > u; j--)
                System.out.print(" ");

            for (int j = 1; j < 2 * u; j++)
                if (u % 2 != 0) {
                    System.out.print("*");
                }

            System.out.println();
        }

////HW Task3

        int sum = 0;
        int nomerok = 5;
        int changableNum = 0;
        for (int i = 1; i <= nomerok; i++) {
            changableNum = changableNum * 10 + 1;
            sum = sum + changableNum;
        }

        System.out.print("=" + sum);

////HW Task1

        System.out.println("\nEnter the year, please");
        int year = scaner.nextInt();
        String leapYear;
        boolean isLeap;
        if (year % 4 != 0) {
            isLeap = false;
        } else {
            if (year % 100 != 0) {
                isLeap = true;
            } else {
                if (year % 400 == 0) {
                    isLeap = true;
                } else {
                    isLeap = false;
                }
                if (isLeap = true) {
                    leapYear = " is leap.";
                } else leapYear = " isn't leap.";
            }
        }
        leapYear = (isLeap) ? " is a leap year." : " isn't a leap year.";

        System.out.println("Congratulation " + year + leapYear);
    }
}
