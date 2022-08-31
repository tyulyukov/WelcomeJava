package synchronize;

public class CountThread implements Runnable {
    private CommonResource res;

    public CountThread(CommonResource res) {
        this.res = res;
    }

    @Override
    public void run() {
        // res.x = 1;
        System.out.println(Thread.currentThread().getName() + " is running");

        synchronized (res) {
            System.out.println(Thread.currentThread().getName() + " is working with common resource");

            for (int i = 1; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + res.x);
                res.x++;

                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {

                }
            }
        }
    }
}
