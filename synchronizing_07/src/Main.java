import workers.ExchangerWorker;
import workers.SemaphoreWorker;
import workers.Worker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Worker worker = new ExchangerWorker();
        worker.work();

        System.out.println("Application thread finished");
    }
}
