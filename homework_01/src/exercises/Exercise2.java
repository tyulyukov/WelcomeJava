package exercises;

import java.util.Scanner;

public class Exercise2 extends Exercise {
    @Override
    public void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        System.out.print("Enter percentage: ");
        int percent = scanner.nextInt();

        scanner.close();
        System.out.print(percent + "% of " + number + " is " + getPercentOfNumber(number, percent));
    }

    private double getPercentOfNumber(int number, double percent) {
        return percent / 100 * number;
    }
}
