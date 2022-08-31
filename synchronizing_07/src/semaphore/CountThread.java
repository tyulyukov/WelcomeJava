package semaphore;

import java.util.concurrent.Semaphore;

public class CountThread implements Runnable {
    private CommonResource res;
    private Semaphore sem;
    private String name;

    public CountThread(CommonResource res, Semaphore sem, String name) {
        this.res = res;
        this.sem = sem;
        this.name = name;
    }

    public void run() {
        try {
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            res.x = 1;

            for (int i = 1; i < 5; i++) {
                System.out.println(this.name + ": " + res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(name + " освобождает разрешение");
        sem.release();
    }
}
