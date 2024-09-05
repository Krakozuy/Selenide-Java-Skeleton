package helpers;

import org.aeonbits.owner.ConfigFactory;

public class TestConfig {

    public static String browser;
    public static String headless;
    public static String baseUrl;
    public static String token;
    public static String adminPassword;
    public static String scoutEmail;
    public static String scoutPassword;
    public static String translationID;

    public static void initConfig() {
        ConfigBuilder cfg = ConfigFactory.create(ConfigBuilder.class);

        browser = cfg.browser();
        headless = cfg.headless();
        baseUrl = cfg.baseUrl();
        token = cfg.token();
    }
    public static boolean isHeadless() {
        return headless.contains("1");
    }
}

