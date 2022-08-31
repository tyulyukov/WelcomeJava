import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class BufferedFileOperations implements FileOperations {
    private final String fileName = "file2.txt";

    private BufferedOutputStream bufferedOutputStream;
    private BufferedInputStream bufferedInputStream;

    public BufferedFileOperations() {
        /*bufferedOutputStream = new BufferedOutputStream();
        bufferedInputStream = new BufferedInputStream();*/
    }

    @Override
    public void write(String text) {

    }

    @Override
    public String read() {
        return null;
    }

    private void internalWrite() {

    }
}
