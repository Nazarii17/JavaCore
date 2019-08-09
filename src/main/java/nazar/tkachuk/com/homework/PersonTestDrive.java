package nazar.tkachuk.com.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTestDrive {
    public static void main(String[] args) {

        String anyChoice;

        List<Person> peopleList = new ArrayList<>();
//        To check how it works you can use the code below

//        peopleList.add(new Person("a", 1));
//        peopleList.add(new Person("b", 2));
//        peopleList.add(new Person("c", 3));
//        peopleList.add(new Person("d", 4));
//        peopleList.add(new Person("e", 5));

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("To add new person enter \"S\"\nTo finish the process enter \"F\"");
            anyChoice = input.nextLine().toLowerCase();
            if (anyChoice.equals("s")) {

                System.out.println("Enter the name");
                String name = new Scanner(System.in).nextLine();

                System.out.println("Enter the year the person was born ");
                int birthYear = new Scanner(System.in).nextInt();

                Person person = new Person(name, birthYear);
                peopleList.add(person);

            } else if (!((anyChoice.equals("s"))) && (!(anyChoice.equals("f")))) {
                System.out.println("Unacceptable symbol\nPlease try again!\n");
            }

        } while (!anyChoice.equals("f"));

        for (Person person : peopleList) {
            System.out.println(person);
        }
    }
}
