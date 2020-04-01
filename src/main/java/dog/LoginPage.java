package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage {

    LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input")
    private List<WebElement> inputFields;

    @FindBy(css = ".btn.btn-secondary.btn-block")
    private WebElement loginButton;

    @FindBy(css = ".WagLoginForm_alert__1AnhH.bootstrap_alert__micD4.bootstrap_alert-warning__3CyDn")
    private WebElement errorMessage;




    public void inputEmail(String email) {
        waitUntilClickable(inputFields.get(0));
        inputFields.get(0).sendKeys(email);
    }

    public void inputPassword(String password) {
        waitUntilClickable(inputFields.get(1));
        inputFields.get(1).sendKeys(password);
    }

    public void clickLoginButton() {
        waitUntilClickable(loginButton);
        loginButton.click();
    }

    public String getErrorText() {
        waitUntilClickable(errorMessage);
        return errorMessage.getText();
    }
}
