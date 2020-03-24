package ui.common;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.WebDriverRunner.*;

public class BaseTest {

    @BeforeEach
    public void beforeClass() {
        ChromeDriver chromeDriver = new ChromeDriver();
        WebDriverRunner.webdriverContainer.setWebDriver(chromeDriver);
        WebDriverRunner.getWebDriver().manage().window().maximize();
        clearBrowserCache();
    }

    @AfterEach
    public void tearDown() {
        clearBrowserCache();
        closeWebDriver();
    }
}
