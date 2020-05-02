package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverInitalization {
    private static WebDriver driver;
    private WebDriverInitalization(){};

    public static WebDriver getInstance(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\ChromeDriver\\chromedriver.exe");
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
