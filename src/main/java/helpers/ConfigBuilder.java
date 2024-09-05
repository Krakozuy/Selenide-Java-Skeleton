package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({"file:config.properties"})
interface ConfigBuilder extends Config {

    @Key("base.browser")
    @DefaultValue("chrome")
    String browser();
    @Key("base.headless")
    @DefaultValue("0")
    String headless();
    @Key("base.url")
    @DefaultValue("google.com")
    String baseUrl();
    @Key("test.token")
    @DefaultValue("")
    String token();
}
