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

    public ResTableType(Scanner scanner) throws IOException {
        chunkHeader = new ResChunkHeader(scanner);
        id = scanner.nextByte();
        res0 = scanner.nextByte();
        res1 = scanner.nextShort();
        entryCount = scanner.nextInt();
        entriesStart = scanner.nextInt();
        tableConfig = new ResTableConfig(scanner);
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
