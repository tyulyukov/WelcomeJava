package workers;

public class WorkerA {
    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void divide(double a, double b) throws Exception {
        if (b == 0)
            throw new Exception("Division by zero");

        System.out.println(a / b);
    }
}
