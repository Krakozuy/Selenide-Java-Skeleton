package com.sportlevel.fastgamesautotests;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import helpers.Driver;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.network.Network;

import java.time.Duration;
import java.util.Optional;

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
