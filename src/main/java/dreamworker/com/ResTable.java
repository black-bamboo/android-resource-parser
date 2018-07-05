package dreamworker.com;

import java.io.IOException;

public class ResTable {

    private ResTableHeader tableHeader;

    private ResStringPool stringPool;

    private ResTablePackage[] packages;

    public ResTable(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        tableHeader = new ResTableHeader(context);
        Log.debug("parsing table package count " + tableHeader.getPackageCount());
        stringPool = new ResStringPool(context);
        packages = new ResTablePackage[tableHeader.getPackageCount()];
        for (int i = 0; i < tableHeader.getPackageCount(); i++) {
            packages[i] = new ResTablePackage(context);
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
