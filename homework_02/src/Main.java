import exercises.Exercise;
import exercises.first.Exercise1;
import exercises.second.Exercise2;
import exercises.third.Exercise3;

public class Main {
    public static void main(String[] args) {
        Exercise[] exercises = { new Exercise1(), new Exercise2(), new Exercise3(), /*new Exercise4(), new Exercise5(),*/ };

        for (int i = 0; i < exercises.length; i++) {
            System.out.println("\n--Exercise " + (i + 1) + "--\n");
            exercises[i].print();
        }
    }
}