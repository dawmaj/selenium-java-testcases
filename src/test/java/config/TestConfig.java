package config;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static config.WebDriverInitalization.getInstance;

public class TestConfig {

    private WebDriver driver;

    public TestConfig setUp(String baseUrl) {
        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //I have a very slow laptop, this value should be lower - eg. 10 seconds
        driver.get(baseUrl);
        return this;
    }
}