package fillers;

import java.util.Scanner;

public class KeyboardFiller implements Filler {
    @Override
    public void fill(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            boolean inputError;
            do {
                inputError = false;

                try {
                    System.out.print("Array[" + i + "] = ");
                    arr[i] = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    inputError = true;
                    System.out.println("Mismatch input");
                }
            } while (inputError);
        }
    }
}
