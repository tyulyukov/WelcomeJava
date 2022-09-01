import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class BaseStream {
    private int[] numbers; /*= { -3, -2, -1, 0, 1, 2, 3 };*/

    public void fill() {
        numbers = new int[1_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt();
        }
    }

    public long negativeCountAlgorithm() {
        long count = 0;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] >= 0)
                count++;

        return count;
    }

    public long negativeCountStream() {
        return Arrays.stream(numbers).filter(num -> num >= 0).count();
    }

    public long negativeCountIntStream() {
        return IntStream.of(numbers).filter(num -> num >= 0).count();
    }

    public long negativeCountParallelStream() {
        return Arrays.stream(numbers).parallel().filter(num -> num >= 0).count();
    }

    public long negativeCountParallelIntStream() {
        return IntStream.of(numbers).parallel().filter(num -> num >= 0).count();
    }
}
