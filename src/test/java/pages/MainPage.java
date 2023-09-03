package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static config.WebDriverInitalization.getInstance;
import static utils.Actions.waitForVisibilityOfElement;

public class MainPage {
    public MainPage() throws InterruptedException {
        PageFactory.initElements(getInstance(), this);
        //waitForVisibilityOfElement(pageContent);
    }

    @FindBy(css = ".js-hp-lazysvg")
    private WebElement pageContent;

    @FindBy(css = ".vcard-names > .vcard-fullname")
    private WebElement fullNameGithub;

    @FindBy(css = "#search_form_input_homepage")
    private WebElement test;

    public String getFullName() {
        return fullNameGithub.getText();
    }

    public void fillIn(){
        test.sendKeys("Zakopane");
    }

    public String getfield() {
        return test.getAttribute("value");
    }
}
