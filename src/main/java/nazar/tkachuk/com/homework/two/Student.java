package nazar.tkachuk.com.homework.two;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    public void print() {
        System.out.println("I'm a Student " + "My name is " + name);
    }
}
