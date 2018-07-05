package dreamworker.com;

public class Context {

    private Scanner scanner;

    private ResStringPool keyStringPool;

    private ResStringPool typeStringPool;

    public Context(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public ResStringPool getKeyStringPool() {
        return keyStringPool;
    }

    public void setKeyStringPool(ResStringPool keyStringPool) {
        this.keyStringPool = keyStringPool;
    }

    public ResStringPool getTypeStringPool() {
        return typeStringPool;
    }

    public void setTypeStringPool(ResStringPool typeStringPool) {
        this.typeStringPool = typeStringPool;
    }
}
