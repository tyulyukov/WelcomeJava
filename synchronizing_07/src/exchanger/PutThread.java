package exchanger;

import java.util.concurrent.Exchanger;

public class PutThread implements Runnable {
    private Exchanger<String> exchanger;
    private String message;

    public PutThread(Exchanger<String> ex) {
        this.exchanger = ex;
        message = "Hello Java!";
    }

    @Override
    public void run() {
        try {
            // Thread.sleep(500);
            message = exchanger.exchange(message);
            System.out.println("PutThread has received: " + message);
        }
        catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

