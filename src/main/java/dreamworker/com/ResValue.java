package dreamworker.com;

import java.io.IOException;

public class ResValue {

    private int size;

    private int res0;

    private int dataType;

    private int data;

    public ResValue(Scanner scanner) throws IOException {
        size = scanner.nextShort();
        res0 = scanner.nextByte();
        dataType = scanner.nextByte();
        data = scanner.nextInt();
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
