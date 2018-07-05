package dreamworker.com;

import java.io.IOException;

public class ResTableMapEntry extends ResTableEntry {

    private int parent;

    private int count;

    private ResTableMap[] tableMaps;

    public ResTableMapEntry(Context context) throws IOException {
        super(context);
        Scanner scanner = context.getScanner();
        parent = scanner.nextInt();

        count = scanner.nextInt();
        tableMaps = new ResTableMap[count];
        for (int i = 0; i < count; i++) {
            tableMaps[i] = new ResTableMap(context);
        }
    }

    public int getParent() {
        return parent;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
