package config;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static config.WebDriverInitalization.getInstance;

public class TestConfig {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        String baseUrl = "https://github.com/dawmaj";
        driver = getInstance();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
}