package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static config.WebDriverInitalization.getInstance;
import static utils.Actions.waitForVisibilityOfElement;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(getInstance(), this);
        waitForVisibilityOfElement(pageContent);
    }

    @FindBy(css = ".application-main")
    private WebElement pageContent;
}
