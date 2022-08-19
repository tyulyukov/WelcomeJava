import fillers.Filler;
import sorters.Sorter;

public class NumbersArray {
    private int[] array;
    private ArrayHelper arrayHelper = new ArrayHelper();

    public NumbersArray(int length) throws Exception {
        if (length < 1)
            throw new Exception("Array can not contain " + length + " elements");

        array = new int[length];
    }

    public void print() {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }

    public int min() {
        return arrayHelper.min(array);
    }

    public int max() {
        return arrayHelper.max(array);
    }

    public double avg() {
        return arrayHelper.avg(array);
    }

    public void fill(Filler filler) {
        filler.fill(array);
    }

    public void sort(Sorter sorter) {
        sorter.sort(array);
    }

    public int binarySearch(int number) {
        return arrayHelper.binarySearch(array, number);
    }

    public void replaceByIndex(int index, int number) {
        arrayHelper.replaceByIndex(array, index, number);
    }

    public void replaceFirst(int fromNumber, int toNumber) {
        arrayHelper.replaceFirst(array, fromNumber, toNumber);
    }

    public void replaceAll(int fromNumber, int toNumber) {
        arrayHelper.replaceAll(array, fromNumber, toNumber);
    }
}

