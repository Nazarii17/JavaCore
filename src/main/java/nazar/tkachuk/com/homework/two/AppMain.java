package nazar.tkachuk.com.homework.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppMain {
    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Student("John"));
        peopleList.add(new Student("Mark"));
        peopleList.add(new Student("Anna"));
        peopleList.add(new Cleaner("Harry"));
        peopleList.add(new Teacher("Lily"));

        List<Staff> staffList1 = new ArrayList<>();
        staffList1.add(new Cleaner("Harry"));
        staffList1.add(new Teacher("Lily"));

//      Created the second list of STAFF extending classes.
        List<Staff> staffList = Arrays.asList(new Cleaner("Harry"), new Teacher("Lily"));
//      Called print() for people and salary() for staff
        peopleList.forEach(Person::print);
        staffList.forEach(Staff::salary);
    }
}