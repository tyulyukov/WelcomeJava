package basics;

public class Turtle extends Animal implements Swimmable {
    public Turtle() {
        super();
    }

    public Turtle(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming...");
    }
}

