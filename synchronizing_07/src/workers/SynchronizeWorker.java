package workers;

public class SynchronizeWorker implements Worker {
    @Override
    public void work() {
        var resource = new synchronize.CommonResource();

        for (int i = 1; i < 6; i++) {
            Thread t = new Thread(new synchronize.CountThread(resource));
            t.setName("Thread " + i);

            System.out.println(t.getName() + " created");

            t.start();
            // t.join();
        }
    }
}
