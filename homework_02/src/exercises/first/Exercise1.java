package exercises.first;

import exercises.Exercise;

public class Exercise1 extends Exercise {
    @Override
    public void print() {
        Human maks = new Human("maks", 16);
        maks.eat();
        maks.sleep();

        Builder vasya = new Builder();
        vasya.age = 34;
        vasya.name = "vasya";
        vasya.sleep();
        vasya.build();

        Sailor petro = new Sailor();
        petro.age = 21;
        petro.name = "petro";
        petro.sail();

        Pilot sanya = new Pilot();
        sanya.age = 27;
        sanya.name = "sanya";
        sanya.fly();
    }
}
