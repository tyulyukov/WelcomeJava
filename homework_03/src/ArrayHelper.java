public class ArrayHelper {
    public int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] < min)
                min = array[i];

        return min;
    }

    public double avg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum / array.length;
    }

    public int binarySearch(int[] array, int number) {
        return binarySearch(array, 0, array.length - 1, number);
    }

    private int binarySearch(int arr[], int low, int high, int number)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == number)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > number)
                return binarySearch(arr, low, mid - 1, number);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, high, number);
        }

        return -1;
    }

    public void replaceByIndex(int[] arr, int index, int number) {
        if (index >= arr.length || index < 0)
            return;

        arr[index] = number;
    }

    public void replaceFirst(int[] arr, int fromNumber, int toNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fromNumber) {
                arr[i] = toNumber;
                break;
            }
        }
    }

    public void replaceAll(int[] arr, int fromNumber, int toNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == fromNumber) {
                arr[i] = toNumber;
            }
        }
    }
}
