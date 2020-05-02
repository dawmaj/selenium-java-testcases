package tests;

import config.TestConfig;
import org.testng.annotations.Test;
import pages.MainPage;

public class FirstTest extends TestConfig {

    @Test
    public void FirstTest(){
        new MainPage();
    }
}
