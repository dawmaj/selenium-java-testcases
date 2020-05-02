package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.WebDriverInitalization.getInstance;

public class Actions {
    static final int WAIT_TIMEOUT = 100; //I have a very slow laptop, this value should be lower - eg. 10 seconds
    private static WebDriverWait wait = new WebDriverWait(getInstance(), WAIT_TIMEOUT);

    public static void waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
