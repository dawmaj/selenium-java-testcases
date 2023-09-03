package tests;

import config.TestConfig;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static config.WebDriverInitalization.quit;

public class FirstTest{

    TestConfig test = new TestConfig();

    @Test
    public void FirstTest() throws InterruptedException {
        test.setUp("https://github.com/dawmaj");
        String text = new MainPage()
                .getFullName();
        Assert.assertEquals(text,"Dawid Majsnerowski");
    }

    @Test
    public void fillIn() throws InterruptedException {
        test.setUp("https://duckduckgo.com/");
        MainPage mp = new MainPage();
        mp.fillIn();
        String text = mp.getfield();
        Assert.assertEquals(text,"Zakopane");
    }

    @AfterTest
    public void closeDriver(){
        quit();
    }
}
