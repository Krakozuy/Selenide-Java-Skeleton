package com.sportlevel.fastgamesautotests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.Driver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import pagesBuilder.App;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected App app;

    @BeforeAll
    public void setUp() {

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        Driver.initDriver();

        app = new App();

    }

    @AfterAll
    public void clearCookies() {
        Driver.clearCookies();
    }
}
