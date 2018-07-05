package dreamworker.com;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ResStringPool {

    private ResStringPoolHeader stringPoolHeader;

    private int[] indices;

    private String[] strings;

    private long stringPoolOffset;

    public ResStringPool(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        Log.debug("parsing string pool:\n------");
        stringPoolOffset = scanner.getPosition();
        stringPoolHeader = new ResStringPoolHeader(context);
        indices = new int[stringPoolHeader.getStringCount()];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = scanner.nextInt();
        }

        strings = new String[indices.length];
        for (int i = 0; i < indices.length - 1; i++) {
            strings[i] = readString(index2Offset(indices[i]), indices[i + 1] - indices[i] - 1, scanner);
            Log.debug("parse string " + strings[i]);
        }

        int lastIndices = indices[indices.length - 1];
        scanner.seek(index2Offset(lastIndices));
        scanner.nextShort();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte b;
        while ((b = scanner.nextByte()) != 0) {
            baos.write(b);
        }
        byte[] lastBytes = baos.toByteArray();
        String lastString = new String(lastBytes);
        Log.debug("parse string " + lastString);
        strings[indices.length - 1] = lastString;

        scanner.seek(stringPoolOffset + stringPoolHeader.getChunkHeader().getSize());
    }

    private long index2Offset(long index) {
        return stringPoolOffset + stringPoolHeader.getStringsStart() + index;
    }

    private String readString(long offset, int len, Scanner scanner) throws IOException {
        scanner.mark();
        scanner.seek(offset);

        byte[] bytes = scanner.nextBytes(len);

        scanner.unmark();

        return new String(bytes, 2, bytes.length - 2);
    }

    public ResStringPoolHeader getStringPoolHeader() {
        return stringPoolHeader;
    }

    public void setStringPoolHeader(ResStringPoolHeader stringPoolHeader) {
        this.stringPoolHeader = stringPoolHeader;
    }

    public int[] getIndices() {
        return indices;
    }

    public void setIndices(int[] indices) {
        this.indices = indices;
    }

    public String getString(int index) {
        return strings[index];
    }
}
