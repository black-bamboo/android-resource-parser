package dreamworker.com;

import java.io.IOException;
import java.util.HashMap;

import static dreamworker.com.ResChunkHeader.RES_TABLE_TYPE_SPEC_TYPE;
import static dreamworker.com.ResChunkHeader.RES_TABLE_TYPE_TYPE;

public class ResTablePackage {

    private ResChunkHeader chunkHeader;

    private ResStringPool typeStringPool;

    private ResStringPool keyStringPool;

    private int id;

    private String name;

    private int typeStrings;

    private int lastPublicType;

    private int keyStrings;

    private int lastPublicKey;

    private int typeIdOffset;

    private HashMap<Integer, ResTableTypeSpec> tableTypeSpecs = new HashMap<>();

    public ResTablePackage(Scanner scanner) throws IOException {
        Log.debug("parsing package");
        long tablePackageStart = scanner.getPosition();
        chunkHeader = new ResChunkHeader(scanner);
        long tablePackageEnd = tablePackageStart + chunkHeader.getSize();
        id = scanner.nextInt();
        byte[] bytes = scanner.nextBytes(256);
        name = new String(bytes);
        typeStrings = scanner.nextInt();
        lastPublicType = scanner.nextInt();
        keyStrings = scanner.nextInt();
        lastPublicKey = scanner.nextInt();
        typeIdOffset = scanner.nextInt();

        typeStringPool = new ResStringPool(scanner);
        keyStringPool = new ResStringPool(scanner);

        while (scanner.getPosition() < tablePackageEnd) {
            scanner.mark();
            ResChunkHeader chunkHeader = new ResChunkHeader(scanner);
            scanner.unmark();
            switch (chunkHeader.getType()) {
                case RES_TABLE_TYPE_SPEC_TYPE: {
                    ResTableTypeSpec tableTypeSpec = new ResTableTypeSpec(scanner, typeStringPool, keyStringPool);
                    tableTypeSpecs.put(tableTypeSpec.getId(), tableTypeSpec);
                }
                    break;
                case RES_TABLE_TYPE_TYPE: {
                    ResTableType tableType = new ResTableType(scanner, keyStringPool);
                    ResTableTypeSpec tableTypeSpec = tableTypeSpecs.get(tableType.getId());
                }
                    break;
            }
        }
    }

    public ResChunkHeader getChunkHeader() {
        return chunkHeader;
    }

    public void setChunkHeader(ResChunkHeader chunkHeader) {
        this.chunkHeader = chunkHeader;
    }

    public ResStringPool getTypeStringPool() {
        return typeStringPool;
    }

    public void setTypeStringPool(ResStringPool typeStringPool) {
        this.typeStringPool = typeStringPool;
    }

    public ResStringPool getKeyStringPool() {
        return keyStringPool;
    }

    public void setKeyStringPool(ResStringPool keyStringPool) {
        this.keyStringPool = keyStringPool;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeStrings() {
        return typeStrings;
    }

    public void setTypeStrings(int typeStrings) {
        this.typeStrings = typeStrings;
    }

    public int getLastPublicType() {
        return lastPublicType;
    }

    public void setLastPublicType(int lastPublicType) {
        this.lastPublicType = lastPublicType;
    }

    public int getKeyStrings() {
        return keyStrings;
    }

    public void setKeyStrings(int keyStrings) {
        this.keyStrings = keyStrings;
    }

    public int getLastPublicKey() {
        return lastPublicKey;
    }

    public void setLastPublicKey(int lastPublicKey) {
        this.lastPublicKey = lastPublicKey;
    }

    public int getTypeIdOffset() {
        return typeIdOffset;
    }

    public void setTypeIdOffset(int typeIdOffset) {
        this.typeIdOffset = typeIdOffset;
    }
}
