package utils;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.WebDriverInitalization.getInstance;

public class Actions {
    static WebDriverWait wait = new WebDriverWait(getInstance(), Duration.ofSeconds(10));

    public static void waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
