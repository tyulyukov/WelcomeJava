package exercises;

import java.util.Scanner;

public class Exercise4 extends Exercise {
    @Override
    public void print() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 6-digits number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 100_000 || number > 999_999) {
            System.err.print("Number must me 6-digits");
            return;
        }

        System.out.print("Result is " + replaceDigits(number));
    }

    private int replaceDigits(int number) {
        StringBuilder numberStr = new StringBuilder(Integer.toString(number));
        var digit1 = numberStr.charAt(0);
        var digit2 = numberStr.charAt(1);
        var digit5 = numberStr.charAt(4);
        var digit6 = numberStr.charAt(5);

        numberStr.setCharAt(0, digit6);
        numberStr.setCharAt(1, digit5);
        numberStr.setCharAt(4, digit2);
        numberStr.setCharAt(5, digit1);

        return Integer.parseInt(numberStr.toString());
    }
}
