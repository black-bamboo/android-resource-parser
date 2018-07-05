package dreamworker.com;

import java.io.IOException;

public class ResTableConfig {

    /**
     * Number of bytes in this structure
     */
    private int size;

    /**
     * union {
     *     struct {
     *         uint16_t mcc;
     *         uint16_t mnc;
     *     };
     *     uint32_t imsi;
     * }
     */
    private int mcc;
    private int mnc;
    private int imsi;

    /**
     * union {
     *     struct {
     *         char language[2];
     *         char country[2];
     *     }
     * }
     */
    private char[] language;
    private char[] country;
    private int locale;

    /**
     * union {
     *     struct {
     *         uint8_t orientation;
     *         uint8_t touchscreen;
     *         uint16_t density;
     *     };
     *     uint32_t screenType;
     * }
     */
    private int orientation;
    private int touchscreen;
    private int density;
    private int screenType;

    /**
     * union {
     *     struct {
     *         uint8_t keyboard;
     *         uint8_t navigation;
     *         uint8_t inputFlags;
     *         uint8_t inputPad0;
     *     };
     *     uint32_t input;
     * }
     */
    private int keyboard;
    private int navigation;
    private int inputFlags;
    private int inputPad0;
    private int input;

    /**
     * union {
     *      struct {
     *          uint16_t screenWidth;
     *          uint16_t screenHeight;
     *      };
     *      uint32_t screenSize;
     * }
     */
    private int screenWidth;
    private int screenHeight;
    private int screenSize;

    /**
     * union {
     *     struct {
     *         uint16_t sdkVersion;
     *         uint16_t minorVersion;
     *     };
     *     uint32_t version;
     * }
     */
    private int sdkVersion;
    private int minorVersion;
    private int version;

    /**
     * union {
     *     struct {
     *         uint8_t screenLayout;
     *         uint8_t uiMode;
     *         uint16_t smallestScreenWidthDp;
     *     };
     *     uint32_t screenConfig;
     * }
     */
    private int screenLayout;
    private int uiMode;
    private int smallestScreenWidthDp;
    private int screenConfig;

    /**
     * union {
     *     struct {
     *         uint16_t screenWidthDp;
     *         uint16_t screenHeightDp;
     *     }
     *     uint32_t screenSizeDp;
     * }
     */
    private int screenWidthDp;
    private int screenHeightDp;
    private int screenSizeDp;

    /**
     * char localeScript[4]
     */
    private byte[] localeScript;

    /**
     * char localeVariant[8]
     */
    private byte[] localeVariant;

    /**
     * union {
     *     struct {
     *         uint8_t screenLayout2;
     *         uint8_t screenConfigPad1;
     *         uint16_t screenConfigPad2;
     *     };
     *     uint32_t screenConfig2;
     * }
     */
    private int screenLayout2;
    private int screenConfigPad1;
    private int screenConfigPad2;
    private int screenConfig2;

    public ResTableConfig(Context context) throws IOException {
        Scanner scanner = context.getScanner();
        size = scanner.nextInt();
        imsi = scanner.nextInt();
        locale = scanner.nextInt();

        screenType = scanner.nextInt();
        density = (screenType >> 16) & 0xffff;

        input = scanner.nextInt();
        screenSize = scanner.nextInt();
        version = scanner.nextInt();
        screenConfig = scanner.nextInt();
        screenSizeDp = scanner.nextInt();
        localeScript = scanner.nextBytes(4);
        localeVariant = scanner.nextBytes(8);
        screenConfig2 = scanner.nextInt();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getMcc() {
        return mcc;
    }

    public void setMcc(int mcc) {
        this.mcc = mcc;
    }

    public int getMnc() {
        return mnc;
    }

    public void setMnc(int mnc) {
        this.mnc = mnc;
    }

    public int getImsi() {
        return imsi;
    }

    public void setImsi(int imsi) {
        this.imsi = imsi;
    }

    public char[] getLanguage() {
        return language;
    }

    public void setLanguage(char[] language) {
        this.language = language;
    }

    public char[] getCountry() {
        return country;
    }

    public void setCountry(char[] country) {
        this.country = country;
    }

    public int getLocale() {
        return locale;
    }

    public void setLocale(int locale) {
        this.locale = locale;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public int getTouchscreen() {
        return touchscreen;
    }

    public void setTouchscreen(int touchscreen) {
        this.touchscreen = touchscreen;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    public int getScreenType() {
        return screenType;
    }

    public void setScreenType(int screenType) {
        this.screenType = screenType;
    }

    public int getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(int keyboard) {
        this.keyboard = keyboard;
    }

    public int getNavigation() {
        return navigation;
    }

    public void setNavigation(int navigation) {
        this.navigation = navigation;
    }

    public int getInputFlags() {
        return inputFlags;
    }

    public void setInputFlags(int inputFlags) {
        this.inputFlags = inputFlags;
    }

    public int getInputPad0() {
        return inputPad0;
    }

    public void setInputPad0(int inputPad0) {
        this.inputPad0 = inputPad0;
    }

    public int getInput() {
        return input;
    }

    public void setInput(int input) {
        this.input = input;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(int sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(int minorVersion) {
        this.minorVersion = minorVersion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getScreenLayout() {
        return screenLayout;
    }

    public void setScreenLayout(int screenLayout) {
        this.screenLayout = screenLayout;
    }

    public int getUiMode() {
        return uiMode;
    }

    public void setUiMode(int uiMode) {
        this.uiMode = uiMode;
    }

    public int getSmallestScreenWidthDp() {
        return smallestScreenWidthDp;
    }

    public void setSmallestScreenWidthDp(int smallestScreenWidthDp) {
        this.smallestScreenWidthDp = smallestScreenWidthDp;
    }

    public int getScreenConfig() {
        return screenConfig;
    }

    public void setScreenConfig(int screenConfig) {
        this.screenConfig = screenConfig;
    }

    public int getScreenWidthDp() {
        return screenWidthDp;
    }

    public void setScreenWidthDp(int screenWidthDp) {
        this.screenWidthDp = screenWidthDp;
    }

    public int getScreenHeightDp() {
        return screenHeightDp;
    }

    public void setScreenHeightDp(int screenHeightDp) {
        this.screenHeightDp = screenHeightDp;
    }

    public int getScreenSizeDp() {
        return screenSizeDp;
    }

    public void setScreenSizeDp(int screenSizeDp) {
        this.screenSizeDp = screenSizeDp;
    }

    public byte[] getLocaleScript() {
        return localeScript;
    }

    public void setLocaleScript(byte[] localeScript) {
        this.localeScript = localeScript;
    }

    public byte[] getLocaleVariant() {
        return localeVariant;
    }

    public void setLocaleVariant(byte[] localeVariant) {
        this.localeVariant = localeVariant;
    }

    public int getScreenLayout2() {
        return screenLayout2;
    }

    public void setScreenLayout2(int screenLayout2) {
        this.screenLayout2 = screenLayout2;
    }

    public int getScreenConfigPad1() {
        return screenConfigPad1;
    }

    public void setScreenConfigPad1(int screenConfigPad1) {
        this.screenConfigPad1 = screenConfigPad1;
    }

    public int getScreenConfigPad2() {
        return screenConfigPad2;
    }

    public void setScreenConfigPad2(int screenConfigPad2) {
        this.screenConfigPad2 = screenConfigPad2;
    }

    public int getScreenConfig2() {
        return screenConfig2;
    }

    public void setScreenConfig2(int screenConfig2) {
        this.screenConfig2 = screenConfig2;
    }
}
