package dreamworker.com;

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
    private char[] localeScript;

    /**
     * char localeVariant[8]
     */
    private char[] localeVariant;

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

    public ResTableConfig(Scanner scanner) {
    }
}
