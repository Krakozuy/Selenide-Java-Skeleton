package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage extends BasePage{


    public GoogleSearchPage(String pageUrl) {
        super(pageUrl);
    }

    public SelenideElement searchTextInput = $("textarea[aria-owns='Alh6id']");

    public SelenideElement goSearchButton = $("input[data-ved='0ahUKEwjo7-r4pqyIAxXBa_UHHWJlJw0Q4dUDCA0']");


    
}
