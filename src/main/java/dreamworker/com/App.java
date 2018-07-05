package dreamworker.com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class App {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fis = new RandomAccessFile(args[0], "r");
        Scanner scanner = new Scanner(fis);
        Context context = new Context(scanner);
        ResTable resTable = new ResTable(context);
        fis.close();
    }
}
