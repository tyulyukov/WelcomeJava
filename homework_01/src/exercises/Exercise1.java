package exercises;

public class Exercise1 extends Exercise {
    private static final String[] strings = { "\"Your time is limited,", "so don’t waste it", "living someone else’s life\"", "Steve Jobs" };

    @Override
    public void print() {
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t");
            }
            System.out.println(strings[i]);
        }
    }
}
