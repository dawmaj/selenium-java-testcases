package tests;

import config.TestConfig;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static config.WebDriverInitalization.quit;

public class FirstTest{

    TestConfig test = new TestConfig();

    @Test
    public void FirstTest(){
        test.setUp("https://github.com/dawmaj");
        String text = new MainPage()
                .getFullName();
        Assert.assertEquals(text,"Dawid Majsnerowski");
    }

    @AfterTest
    public void closeDriver(){
        quit();
    }
}
