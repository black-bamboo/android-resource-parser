package dreamworker.com;

import java.io.IOException;

public class ResTableHeader {

    private ResChunkHeader chunkHeader;

    private int packageCount;

    public ResTableHeader(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        chunkHeader = new ResChunkHeader(context);
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
