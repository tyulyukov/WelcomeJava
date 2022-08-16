import entities.Group;
import entities.User;
import workers.WorkerA;

public class Main {
    public static void main(String[] args) {
        WorkerA.sayHelloTo("World");

        var worker = new WorkerA();

        try {
            worker.divide(15, 0);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        User user = new User();
        user.setUsername("tyulyukov");
        user.setEmail("tyulyukov@gmail.com");

        var group1 = new Group();
        group1.setName("pv021");
        group1.setDepartment("Web Developers");

        var group2 = new Group("pv021", "Software Engineers");

        var group3 = new Group();

        System.out.println(user);
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }
}