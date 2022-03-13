package lesson8.hw8Teacher.animal.starter;

import lesson8.hw8Teacher.animal.Animal;
import lesson8.hw8Teacher.animal.Cat;
import lesson8.hw8Teacher.animal.Cow;
import lesson8.hw8Teacher.animal.Dog;

public class AnimalRunner {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        Animal[] animals = new Animal[]{cat, dog, cow};
        for (Animal animal : animals) {
            animal.voice();
        }
    }
}
