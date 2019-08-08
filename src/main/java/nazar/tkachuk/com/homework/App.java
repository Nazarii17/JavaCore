package nazar.tkachuk.com.homework;



import java.util.Scanner;


public class App {
    public static void main(String[] args) {


//        String hw = "Hello World";                                                // The second way
//        System.out.println(hw);
        System.out.println("Hello World");                                          // Task 1

        Scanner scanner = new Scanner(System.in);                                   // Task 2
        System.out.println("\nEnter the first number");
        int a = scanner.nextInt();
        System.out.println("Enter the second number");

        int b = scanner.nextInt();
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        String phrase = "After counting we got next results: ";

        System.out.println("You entered two numbers.\nThe first number(a) is " + a + ".\nThe second number(b) is " + b + ".");
        System.out.println("\n" + phrase);
        System.out.println("Addition 'a' + 'b' = " + addition);
        System.out.println("Subtraction 'a' - 'b' = " + subtraction);
        System.out.println("Multiplication 'a' * 'b' = " + multiplication);
        System.out.println("Division 'a' / 'b' = " + division);

        System.out.println("\nBy the way.\nHow are you?");                          // Task 3
        System.out.println("Enter the answer");
        String answer = scanner.next().toLowerCase();
        System.out.println("\nI am " + answer + ".");

        char cha = '\u00B2';                                                        // Task 4
        char chasr = '\u221A';
        System.out.println("\nEnter the number of  \"x\" please ");
        int x = scanner.nextInt();
        System.out.println("X = " + x);
        System.out.println("\n" + phrase);


        double square = Math.pow(x, 2);
        System.out.println("Square\nX" + cha + "= " + square);
//        int sq = x*x;                                                             // The second way
//        System.out.println("X" + cha + "= " + sq);
        double sqrt = Math.sqrt(x);
        System.out.println("Square root\n" + chasr + "X = " + sqrt);

        System.out.println("\nOne more thing");                                     // HW Task 1
        System.out.println("What is yor name?");
        System.out.println("Enter the name.");
        String name = scanner.next();
        System.out.println(name + ", how old are you?");
        System.out.println("Enter the age.");
        int age = scanner.nextInt();
        System.out.println("\nWell, nice to meet you " + name + ", " + age + " is always a good age.");

        System.out.println("Enter the radius in meters");                           // HW Task 2
        int radius = scanner.nextInt();
        System.out.println(phrase);
        double perimeter = 2 * Math.PI * radius;
        System.out.print("Perimeter = ");
        System.out.format("%.1f%n", perimeter);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.print("Area = ");
        System.out.format("%.1f%n", area);
    }
}

