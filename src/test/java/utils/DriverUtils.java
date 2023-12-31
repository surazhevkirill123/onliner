package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import java.util.Collections;

public class DriverUtils {
    public static void openBrowser(){
        Selenide.open("https://google.com");
    }

    public static void closeBrowser(){
        WebDriverRunner.closeWebDriver();
    }

    public static void browserConfiguration() {
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
