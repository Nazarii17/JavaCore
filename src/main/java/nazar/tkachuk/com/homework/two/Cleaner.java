package nazar.tkachuk.com.homework.two;

public class Cleaner extends Staff {

    public Cleaner(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Cleaner");
    }

    @Override
    public void salary() {
        System.out.println("My salary is 250$/per month");
    }
}