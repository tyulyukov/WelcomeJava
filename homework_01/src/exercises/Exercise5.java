package exercises;

import java.util.Scanner;

public class Exercise5 extends Exercise {
    @Override
    public void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month number (1-12): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 1 || number > 12) {
            System.err.print("Number must me from 1 to 12");
            return;
        }

        if (number <= 2 || number == 12) System.out.print("Winter");
        else if (number <= 5) System.out.print("Spring");
        else if (number <= 8) System.out.print("Summer");
        else System.out.print("Autumn");
    }
}
