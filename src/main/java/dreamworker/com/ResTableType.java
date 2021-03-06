package dreamworker.com;

import java.io.IOException;

public class ResTableType {

    private ResChunkHeader chunkHeader;

    private int id;

    private int res0;

    private int res1;

    private int entryCount;

    private int entriesStart;

    private ResTableConfig tableConfig;

    private ResTableEntry[] tableEntries;

    public ResTableType(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        long tableTypeStart = scanner.getPosition();
        chunkHeader = new ResChunkHeader(context);
        id = scanner.nextByte();
        res0 = scanner.nextByte();
        res1 = scanner.nextShort();
        entryCount = scanner.nextInt();
        entriesStart = scanner.nextInt();
        tableConfig = new ResTableConfig(context);

        Log.debug("parsing type id " + id + " entryCount " + entryCount + " density " + tableConfig.getDensity() + "\n------");

        scanner.seek(tableTypeStart + entriesStart);
        tableEntries = new ResTableEntry[entryCount];
        for (int i = 0; i < entryCount; i++) {
            scanner.mark();
            ResTableEntry temp = new ResTableEntry(context);
            if (temp.isComplex()) {
                scanner.unmark();
                temp = new ResTableMapEntry(context);
            }
            tableEntries[i] = temp;
        }
    }

    public ResChunkHeader getChunkHeader() {
        return chunkHeader;
    }

    public void setChunkHeader(ResChunkHeader chunkHeader) {
        this.chunkHeader = chunkHeader;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRes0() {
        return res0;
    }

    public void setRes0(int res0) {
        this.res0 = res0;
    }

    public int getRes1() {
        return res1;
    }

    public void setRes1(int res1) {
        this.res1 = res1;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public void setEntryCount(int entryCount) {
        this.entryCount = entryCount;
    }

    public int getEntriesStart() {
        return entriesStart;
    }

    public void setEntriesStart(int entriesStart) {
        this.entriesStart = entriesStart;
    }

    public ResTableConfig getTableConfig() {
        return tableConfig;
    }

    public void setTableConfig(ResTableConfig tableConfig) {
        this.tableConfig = tableConfig;
    }
}
