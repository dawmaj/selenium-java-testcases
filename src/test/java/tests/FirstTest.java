package tests;

import config.TestConfig;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static config.WebDriverInitalization.quit;

public class FirstTest extends TestConfig {

    @Test
    public void FirstTest(){
        String text = new MainPage()
                .getFullName();
        Assert.assertEquals(text,"Dawid Majsnerowski");
    }

    @AfterTest
    public void closeDriver(){
        quit();
    }
}
