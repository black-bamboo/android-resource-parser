package dreamworker.com;

import java.io.IOException;
import java.io.RandomAccessFile;

public class App {

    public static void main(String[] args) throws IOException {
        RandomAccessFile fis = new RandomAccessFile(args[0], "r");
        Scanner scanner = new Scanner(fis);
        ResTable resTable = new ResTable(scanner);

        output("type : " + resTable.getTableHeader().getChunkHeader().getTypeString());
        output("package count : " + resTable.getTableHeader().getPackageCount());
        output("");

        ResStringPool stringPool = resTable.getStringPool();
        output("type : " + stringPool.getStringPoolHeader().getChunkHeader().getTypeString());
        output("string count : " + stringPool.getStringPoolHeader().getStringCount());
        output("style count : " + stringPool.getStringPoolHeader().getStyleCount());
        output("is utf8 : " + stringPool.getStringPoolHeader().isUTF8());
        output("strings start : " + stringPool.getStringPoolHeader().getStringsStart());

        fis.close();
    }

    public static void output(String msg) {
        System.out.println(msg);
    }
}
