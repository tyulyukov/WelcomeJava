package exercises;

import java.util.Scanner;

public class Exercise3 extends Exercise {
    private static final int numberLength = 3;

    @Override
    public void print() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < numberLength; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            finalString.append(number);
        }

        int finalNumber = Integer.parseInt(finalString.toString());
        System.out.println("Result is " + finalNumber);

        scanner.close();
    }
}
