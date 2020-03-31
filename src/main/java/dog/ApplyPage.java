package dog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;

public class ApplyPage extends BasePage {

    public ApplyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"email\"]")
    private WebElement emailField;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordField;

    @FindBy(css = "input[name=\"firstName\"]")
    private WebElement firstNameField;

    @FindBy(css = "input[name=\"lastName\"]")
    private WebElement lastNameField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement phoneField;

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.laYMsi")
    private List<WebElement> listErrors;



    public void inputEmail(String email) {
        waitUntilClickable(emailField);
        emailField.sendKeys(email);
    }

    public void inputPassword(String password){
        waitUntilClickable(passwordField);
        passwordField.sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        waitUntilClickable(firstNameField);
        firstNameField.sendKeys(firstName);
    }

    public void  inputLastName(String lastName) {
        waitUntilClickable(lastNameField);
        lastNameField.sendKeys(lastName);
    }

    public void inputPhone(String phone) {
        waitUntilClickable(phoneField);
        phoneField.sendKeys(phone);
    }

    public void clickEmailField() {
        waitUntilClickable(emailField);
        emailField.click();
    }

    public void clickFirstName() {
        waitUntilClickable(firstNameField);
        firstNameField.click();
    }

    public void clickLastName() {
        waitUntilClickable(lastNameField);
        lastNameField.click();
    }

    public void clickPhoneField() {
        waitUntilClickable(phoneField);
        phoneField.click();
    }

    public String getErrorEmail() {
        waitUntilVisible(listErrors.get(0));
        return listErrors.get(0).getText();
    }

    public String getErrorFirstName() {
        waitUntilVisible(listErrors.get(1));
        return listErrors.get(1).getText();
    }

    public String getErrorLastName() {
        waitUntilVisible(listErrors.get(2));
        return listErrors.get(2).getText();
    }

    public String getErrorPhone() {
        waitUntilVisible(listErrors.get(3));
        return listErrors.get(3). getText();
    }
}
