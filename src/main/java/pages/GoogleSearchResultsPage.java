package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GoogleSearchResultsPage extends BasePage{
    

    public GoogleSearchResultsPage(String pageUrl) {
        super(pageUrl);
    }

    public SelenideElement divMain = $("#main");

    
}
