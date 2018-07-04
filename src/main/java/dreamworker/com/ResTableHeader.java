package dreamworker.com;

import java.io.IOException;

public class ResTableHeader {

    private ResChunkHeader chunkHeader;

    private int packageCount;

    public ResTableHeader(Scanner scanner) throws IOException {
        chunkHeader = new ResChunkHeader(scanner);
        packageCount = scanner.nextInt();
    }

    public ResChunkHeader getChunkHeader() {
        return chunkHeader;
    }

    public void setChunkHeader(ResChunkHeader chunkHeader) {
        this.chunkHeader = chunkHeader;
    }

    public int getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(int packageCount) {
        this.packageCount = packageCount;
    }
}
