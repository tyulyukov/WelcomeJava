public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (isInterrupted())
                    break;

                Thread.sleep(200);
                System.out.println(i + ": id=" + Thread.currentThread().getId() + " name=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException ex) {
            System.out.println("interrupt fired");
            // interrupt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
