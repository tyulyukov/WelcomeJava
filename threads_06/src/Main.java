public class Main {
    public static void main(String[] args) {
        try {
            var thread = new MyThread();
            thread.start();
            thread.join();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Application thread finished");
        }
    }
}