package dreamworker.com;

import java.io.IOException;

public class ResValue {

    static final int TYPE_NULL = 0x00;

    static final int TYPE_REFERENCE = 0x01;

    static final int TYPE_ATTRIBUTE = 0x02;

    static final int TYPE_STRING = 0x03;

    static final int TYPE_FLOAT = 0x04;

    static final int TYPE_DIMENSION = 0x05;

    static final int TYPE_FRACTION = 0x06;

    static final int TYPE_DYNAMIC_REFERENCE = 0x07;

    static final int TYPE_DYNAMIC_ATTRIBUTE = 0x08;

    static final int TYPE_FIRST_INT = 0x10;

    static final int TYPE_INT_DEC = 0x10;

    static final int TYPE_INT_HEX = 0x11;

    static final int TYPE_INT_BOOLEAN = 0x12;

    static final int TYPE_FIRST_COLOR_INT = 0x1c;

    static final int TYPE_INT_COLOR_ARGB8 = 0x1c;

    static final int TYPE_INT_COLOR_RGB8 = 0x1d;

    static final int TYPE_INT_COLOR_ARGB4 = 0x1e;

    static final int TYPE_INT_COLOR_RGB4 = 0x1f;

    static final int TYPE_LAST_COLOR_INT = 0x1f;

    static final int TYPE_LAST_INT = 0x1f;

    private int size;

    private int res0;

    private int dataType;

    private int data;

    public ResValue(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        size = scanner.nextShort();
        res0 = scanner.nextByte();
        dataType = scanner.nextByte();
        data = scanner.nextInt();
        Log.debug("parsing value type " + dataType + " data " + data + "\n------");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRes0() {
        return res0;
    }

    public void setRes0(int res0) {
        this.res0 = res0;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
