package pages;

import com.codeborne.selenide.Selenide;
import helpers.Trim;
import pagesBuilder.AppConfig;

public class BasePage {

    protected String pageUrl;

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        Selenide.open(AppConfig.baseUrl);
    }
    
    
}
