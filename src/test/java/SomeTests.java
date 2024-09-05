import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static com.codeborne.selenide.Condition.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SomeTests extends BaseTest{

    @Test
    @Description("Проверить что все ставки заблокированы во время игры")
    public void checkThatSearchIsWorking(){
        app.googleSearchPage.open();
        app.googleSearchPage.searchTextInput.setValue("speedtest.net").pressEnter();
        app.googleSearchResultsPage.divMain.shouldHave(text("Speedtest от Ookla - Глобальный тест скорости"));

    }

}
