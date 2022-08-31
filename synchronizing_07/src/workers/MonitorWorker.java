package workers;

import monitor.Consumer;
import monitor.Producer;
import monitor.Store;

public class MonitorWorker implements Worker {
    @Override
    public void work() {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
