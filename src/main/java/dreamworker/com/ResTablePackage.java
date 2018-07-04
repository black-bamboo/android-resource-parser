package dreamworker.com;

import java.io.IOException;

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

    public ResTablePackage(Scanner scanner) throws IOException {
        chunkHeader = new ResChunkHeader(scanner);
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
