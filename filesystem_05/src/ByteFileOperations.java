import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteFileOperations implements FileOperations {
    private final String fileName = "file.txt";

    @Override
    public void write(String text) {
        try {
            var fs = new FileOutputStream(fileName);
            var buffer = text.getBytes();
            fs.write(buffer, 0, buffer.length);
            fs.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String read() {
        try {
            var fin = new FileInputStream(fileName);
            var builder = new StringBuilder();

            System.out.println("File size: " + fin.available() + "bytes \n");

            int i = -1;
            while((i = fin.read()) != -1) {
                builder.append((char)i);
            }

            fin.close();

            return builder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
