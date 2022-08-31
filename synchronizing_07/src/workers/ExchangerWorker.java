package workers;

import exchanger.GetThread;
import exchanger.PutThread;

import java.util.concurrent.Exchanger;

public class ExchangerWorker implements Worker {
    @Override
    public void work() {
        Exchanger<String> ex = new Exchanger<String>();
        new Thread(new PutThread(ex)).start();
        new Thread(new GetThread(ex)).start();
    }
}
