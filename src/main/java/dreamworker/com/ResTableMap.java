package dreamworker.com;

import java.io.IOException;

public class ResTableMap {

    /**
     * The resource identifier defining this mapping's name.
     * For attribute resources, 'name' can be one of the following special resource types to supply meta-data about the attribute;
     * for all other resource types it must be an attribute resource.
     */
    private int name;

    private ResValue value;

    public ResTableMap(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        name = scanner.nextInt();
        value = new ResValue(context);
        Log.debug("parsing map name " + Integer.toHexString(name) + " value " + value.getData());
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public ResValue getValue() {
        return value;
    }

    public void setValue(ResValue value) {
        this.value = value;
    }
}
