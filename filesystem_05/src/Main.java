public class Main {
    public static void main(String[] args) {
        var fs = new ByteFileOperations();

        try {
            fs.write("Hello");
            System.out.println(fs.read());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }
}