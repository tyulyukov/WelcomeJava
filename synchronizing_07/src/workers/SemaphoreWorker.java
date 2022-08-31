package workers;

import semaphore.CommonResource;
import semaphore.CountThread;

import java.util.concurrent.Semaphore;

public class SemaphoreWorker implements Worker {
    @Override
    public void work() {
        Semaphore sem = new Semaphore(1); // 1 разрешение
        CommonResource res = new CommonResource();

        new Thread(new CountThread(res, sem, "CountThread 1")).start();
        new Thread(new CountThread(res, sem, "CountThread 2")).start();
        new Thread(new CountThread(res, sem, "CountThread 3")).start();
    }
}

