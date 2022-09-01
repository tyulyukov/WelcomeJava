public class Main {
    public static void main(String[] args) {
        var baseStream = new BaseStream();
        baseStream.fill();

        var time = System.nanoTime();
        var count = baseStream.negativeCountAlgorithm();

        System.out.println((System.nanoTime() - time) + " ns: " + count + " by algorithm");

        var time2 = System.nanoTime();
        var count2 = baseStream.negativeCountStream();

        System.out.println((System.nanoTime() - time2) + " ns: " + count2 + " by Stream");

        var time3 = System.nanoTime();
        var count3 = baseStream.negativeCountIntStream();

        System.out.println((System.nanoTime() - time3) + " ns: " + count3 + " by Int Stream");

        var time4 = System.nanoTime();
        var count4 = baseStream.negativeCountParallelStream();

        System.out.println((System.nanoTime() - time4) + " ns: " + count4 + " by Parallel Stream");

        var time5 = System.nanoTime();
        var count5 = baseStream.negativeCountParallelIntStream();

        System.out.println((System.nanoTime() - time5) + " ns: " + count5 + " by Parallel Int Stream");
    }
}