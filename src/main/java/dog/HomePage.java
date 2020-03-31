package dog;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".sc-ifAKCX.elWjVh")
    private WebElement bookWalkButton;

    @FindBy(css = ".sc-ifAKCX.GCetG")
    private List<WebElement> loginButtonList;


    public ApplyDubPage clickBookWalkButton() {
        waitUntilClickable(bookWalkButton);
        bookWalkButton.click();
        return new ApplyDubPage(driver);
    }

    public void clickLoginButton() {
        waitUntilClickable(loginButtonList.get(2));
        loginButtonList.get(2).click();
    }
}
