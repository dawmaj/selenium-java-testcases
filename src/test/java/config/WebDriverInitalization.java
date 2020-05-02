package config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverInitalization {
    private static WebDriver driver;
    private WebDriverInitalization(){};

    public static WebDriver getInstanceChrome(){
        if (driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver getInstanceFirefox(){
        if (driver == null)
        {
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\GeckoDriver\\geckodriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void quit() {
        if(null != driver) {
            driver.quit();
        }
        driver = null;
    }
}
