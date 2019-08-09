package nazar.tkachuk.com.homework.two;

public class Teacher extends Staff {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("I'm a Teacher");
    }

    @Override
    void salary() {
        System.out.println("My salary is 4000$/per month ");
    }
}
