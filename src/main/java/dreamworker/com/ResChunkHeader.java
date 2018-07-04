package dreamworker.com;

import java.io.IOException;

public class ResChunkHeader {

    static final int RES_NULL_TYPE = 0;

    static final int RES_STRING_POOL_TYPE = 1;

    static final int RES_TABLE_TYPE = 2;

    static final int RES_XML_TYPE = 3;

    static final int RES_TABLE_PACKAGE_TYPE = 0x0200;

    static final int RES_TABLE_TYPE_TYPE = 0x0201;

    static final int RES_TABLE_TYPE_SPEC_TYPE = 0x0202;

    static final int RES_TABLE_LIBRARY_TYPE = 0x0203;

    /**
     * Type identifier for this chunk
     */
    private int type;

    /**
     * Size of the chunk header (in bytes)
     */
    private int headerSize;

    /**
     * Total size of this chunk
     */
    private int size;

    public ResChunkHeader(Scanner scanner) throws IOException {
        type = scanner.nextShort();
        headerSize = scanner.nextShort();
        size = scanner.nextInt();
    }

    public int getType() {
        return type;
    }

    public String getTypeString() {
        switch (type) {
            case RES_NULL_TYPE:
                return "null";
            case RES_STRING_POOL_TYPE:
                return "string pool";
            case RES_TABLE_TYPE:
                return "table";
            case RES_XML_TYPE:
                return "xml";
            case RES_TABLE_PACKAGE_TYPE:
                return "package";
            case RES_TABLE_TYPE_TYPE:
                return "type";
            case RES_TABLE_TYPE_SPEC_TYPE:
                return "type spec";
            case RES_TABLE_LIBRARY_TYPE:
                return "library";
            default:
                return "unknown";
        }
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(int headerSize) {
        this.headerSize = headerSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
