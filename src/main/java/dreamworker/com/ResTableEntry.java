package dreamworker.com;

import java.io.IOException;

public class ResTableEntry {

    private static final int FLAG_COMPLEX = 0x0001;

    private static final int FLAG_PUBLIC = 0x0002;

    private static final int FLAG_WEAK = 0x0004;

    /**
     * uint16_t size
     */
    private int size;

    /**
     * uint16_t flags;
     */
    private int flags;

    /**
     * reference into ResTable_package::keyStrings identifying this entry
     */
    private int keyStringPoolRef;

    private ResValue value;

    public ResTableEntry(Scanner scanner, ResStringPool keyStringPool) throws IOException {
        size = scanner.nextShort();
        flags = scanner.nextShort();
        keyStringPoolRef = scanner.nextInt();

        if (!isComplex()) {
            value = new ResValue(scanner);
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public boolean isComplex() {
        return (flags & FLAG_COMPLEX) != 0;
    }

    public boolean isPublic() {
        return (flags & FLAG_PUBLIC) != 0;
    }

    public boolean isWeak() {
        return (flags & FLAG_WEAK) != 0;
    }

    public int getKeyStringPoolRef() {
        return keyStringPoolRef;
    }

    public void setKeyStringPoolRef(int keyStringPoolRef) {
        this.keyStringPoolRef = keyStringPoolRef;
    }

    public ResValue getValue() {
        return value;
    }

    public void setValue(ResValue value) {
        this.value = value;
    }
}
