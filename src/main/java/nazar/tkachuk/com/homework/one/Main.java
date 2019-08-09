package nazar.tkachuk.com.homework.one;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog();

        Cat cat = new Cat();
        Cat cat1 = new Cat();

        List<Animal> animalsList = new ArrayList<>();

        animalsList.add(dog);
        animalsList.add(dog1);
        animalsList.add(cat);
        animalsList.add(cat1);

        for (Animal animal : animalsList) {
            animal.voice();
            animal.feed();
        }

//        System.out.println(animalsList);
    }
}

