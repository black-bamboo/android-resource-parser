package dreamworker.com;

import java.io.IOException;
import java.util.HashMap;

public class ResTableTypeSpec {

    private ResChunkHeader chunkHeader;

    private int id;

    private int res0;

    private int res1;

    private int entryCount;

    private int[] configs;

    private HashMap<Integer, ResTableType> tableTypes;

    private ResStringPool typeStringPool;

    private ResStringPool keyStringPool;

    public ResTableTypeSpec(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        chunkHeader = new ResChunkHeader(context);
        id = scanner.nextByte();
        res0 = scanner.nextByte();
        res1 = scanner.nextShort();

        entryCount = scanner.nextInt();
        configs = new int[entryCount];
        for (int i = 0; i < entryCount; i++) {
            configs[i] = scanner.nextInt();
        }

        Log.debug("parsing type spec id " + id + " entryCount " + entryCount + "\n------");

        long typeSpecSize = chunkHeader.getSize() - chunkHeader.getHeaderSize();
        tableTypes = new HashMap<>();
        while (typeSpecSize > 0) {
            ResTableType tableType = new ResTableType(context);
            tableTypes.put(tableType.getId(), tableType);
            typeSpecSize -= tableType.getChunkHeader().getSize();
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

    public int[] getConfigs() {
        return configs;
    }

    public void setConfigs(int[] configs) {
        this.configs = configs;
    }

    public HashMap<Integer, ResTableType> getTableTypes() {
        return tableTypes;
    }

    public ResTableType getTableType(int id) {
        return tableTypes.get(id);
    }

    public void setTableTypes(HashMap<Integer, ResTableType> tableTypes) {
        this.tableTypes = tableTypes;
    }
}
