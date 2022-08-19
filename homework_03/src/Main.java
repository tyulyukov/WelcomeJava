import fillers.KeyboardFiller;
import fillers.RandomFiller;
import sorters.AscSorter;
import sorters.DescSorter;

public class Main {
    public static void main(String[] args) {
        try {
            var arr = new NumbersArray(5);
            arr.print();

            System.out.println("\nRandom filling: ");
            arr.fill(new RandomFiller());
            arr.print();

            System.out.println("\nKeyboard filling: ");
            arr.fill(new KeyboardFiller());
            arr.print();

            System.out.println("Min: " + arr.min());
            System.out.println("Max: " + arr.max());
            System.out.println("Avg: " + arr.avg());

            System.out.println("\nDescending sorted: ");
            arr.sort(new DescSorter());
            arr.print();

            System.out.println("\nAscending sorted: ");
            arr.sort(new AscSorter());
            arr.print();

            // array must be ascending sorted
            System.out.println("\nIndex of number 5: " + arr.binarySearch(5) + " (using binary search)");

            System.out.println("\nReplaced index 0 value to number 4224: ");
            arr.replaceByIndex(0, 4224);
            arr.print();

            System.out.println("\nReplaced first number 5 to number -999: ");
            arr.replaceFirst(5, -999);
            arr.print();

            System.out.println("\nReplaced all numbers 5 to number 123456: ");
            arr.replaceAll(5, 123456);
            arr.print();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}