package dreamworker.com;

import java.io.IOException;

public class ResTableMapEntry {

    private ResTableEntry tableEntry;

    private int parent;

    private int count;

    public ResTableMapEntry(Context context) throws IOException {
        tableEntry = new ResTableEntry(context);
    }

    public ResTableEntry getTableEntry() {
        return tableEntry;
    }

    public void setTableEntry(ResTableEntry tableEntry) {
        this.tableEntry = tableEntry;
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
