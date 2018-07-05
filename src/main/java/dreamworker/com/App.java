package dreamworker.com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class App {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fis = new RandomAccessFile(args[0], "r");
        Scanner scanner = new Scanner(fis);
        ResTable resTable = new ResTable(scanner);
        fis.close();
    }

    public static void output(String msg) {
        System.out.println(msg);
    }
}
