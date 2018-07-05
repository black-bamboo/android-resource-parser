package dreamworker.com;

import java.io.IOException;

public class ResTable {

    private ResTableHeader tableHeader;

    private ResStringPool stringPool;

    private ResTablePackage[] packages;

    public ResTable(Scanner scanner) throws IOException {
        tableHeader = new ResTableHeader(scanner);
        Log.debug("parsing table package count " + tableHeader.getPackageCount());
        stringPool = new ResStringPool(scanner);
        packages = new ResTablePackage[tableHeader.getPackageCount()];
        for (int i = 0; i < tableHeader.getPackageCount(); i++) {
            packages[i] = new ResTablePackage(scanner);
        }
    }

    public ResTableHeader getTableHeader() {
        return tableHeader;
    }

    public void setTableHeader(ResTableHeader tableHeader) {
        this.tableHeader = tableHeader;
    }

    public ResStringPool getStringPool() {
        return stringPool;
    }

    public void setStringPool(ResStringPool stringPool) {
        this.stringPool= stringPool;
    }

    public ResTablePackage[] getPackages() {
        return packages;
    }

    public void setPackages(ResTablePackage[] packages) {
        this.packages = packages;
    }
}
