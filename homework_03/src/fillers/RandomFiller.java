package fillers;

import java.util.concurrent.ThreadLocalRandom;

public class RandomFiller implements Filler {
    @Override
    public void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt();
        }
    }
}
