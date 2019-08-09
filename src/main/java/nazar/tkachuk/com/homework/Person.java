package nazar.tkachuk.com.homework;

import java.time.Year;

public class Person {
    private String name;
    private int birthYear;

    public Person() {
    }

    public Person (String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int age() {
        return Year.now().getValue()-getBirthYear();
    }

    public String toString() {
        return "Person{" + "[Name= " + getName().substring(0, 1).toUpperCase() + getName().substring(1)
                + ", Birth Year= " + getBirthYear() + ", Birth Year= " + age() + "]";
    }

}
