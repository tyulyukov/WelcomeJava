package exercises.second;

import exercises.Exercise;

public class Exercise2 extends Exercise {
    @Override
    public void print() {
        Animal animal = new Animal();
        animal.color = "white";
        animal.weight = 15;
        animal.say();

        Cat cat = new Cat();
        cat.say();

        Dog dog = new Dog();
        dog.say();

        Cow cow = new Cow();
        cow.color = "black-white";
        cow.say();
    }
}
