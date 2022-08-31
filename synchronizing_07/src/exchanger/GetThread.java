package exchanger;

import java.util.concurrent.Exchanger;

public class GetThread implements Runnable {
    private Exchanger<String> exchanger;
    private String message;

    public GetThread(Exchanger<String> ex) {
        this.exchanger = ex;
        message = "Hello World!";
    }

    @Override
    public void run() {
        try {
            message = exchanger.exchange(message);
            System.out.println("GetThread has received: " + message);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
