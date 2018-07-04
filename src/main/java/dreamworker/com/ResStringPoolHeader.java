package dreamworker.com;

import java.io.IOException;

public class ResStringPoolHeader {

    static final int SORTED_FLAG = 1 << 0;

    static final int UTF8_FLAG = 1 << 8;

    private ResChunkHeader chunkHeader;

    private int stringCount;

    private int styleCount;

    private int flags;

    private int stringsStart;

    private int stylesStart;

    public ResStringPoolHeader(Scanner scanner) throws IOException {
        chunkHeader = new ResChunkHeader(scanner);
        stringCount = scanner.nextInt();
        styleCount = scanner.nextInt();
        flags = scanner.nextInt();
        stringsStart = scanner.nextInt();
        stylesStart = scanner.nextInt();
    }

    public boolean isSorted() {
        return (flags & SORTED_FLAG) != 0;
    }

    public boolean isUTF8() {
        return (flags & UTF8_FLAG) != 0;
    }

    public ResChunkHeader getChunkHeader() {
        return chunkHeader;
    }

    public void setChunkHeader(ResChunkHeader chunkHeader) {
        this.chunkHeader = chunkHeader;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    public int getStyleCount() {
        return styleCount;
    }

    public void setStyleCount(int styleCount) {
        this.styleCount = styleCount;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public int getStringsStart() {
        return stringsStart;
    }

    public void setStringsStart(int stringsStart) {
        this.stringsStart = stringsStart;
    }

    public int getStylesStart() {
        return stylesStart;
    }

    public void setStylesStart(int stylesStart) {
        this.stylesStart = stylesStart;
    }
}
