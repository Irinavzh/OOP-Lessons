package dog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ApplyDubPage extends BasePage {

    public ApplyDubPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input.sc-iwsKbI")
    private List<WebElement> listFields;

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.laYMsi")
    private List<WebElement> listErrorMessage;

    @FindBy(css = ".sc-bdVaJa.sc-bxivhb.laYMsi")
    private List<WebElement> errorEmailMessage;




    public void inputEmail(String email) {
        waitUntilClickable(listFields.get(0));
        listFields.get(0).sendKeys(email);
    }

    public void inputPassword(String password) {
        waitUntilClickable(listFields.get(1));
        listFields.get(1).sendKeys(password);
    }

    public void inputFirstName(String firstName) {
        waitUntilClickable(listFields.get(2));
        listFields.get(2).sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        waitUntilClickable(listFields.get(3));
        listFields.get(3).sendKeys(lastName);
    }

    public void inputPhone(String phone) {
        waitUntilClickable(listFields.get(4));
        listFields.get(4).sendKeys(phone);
    }

    public void clickEmail() {
        waitUntilClickable(listFields.get(0));
        listFields.get(0).click();
    }

    public void clickPassword() {
        waitUntilClickable(listFields.get(1));
        listFields.get(1).click();
    }

    public void clickFirstName() {
        waitUntilClickable(listFields.get(2));
        listFields.get(2).click();
    }

    public void clickLastName() {
        waitUntilClickable(listFields.get(3));
        listFields.get(3).click();
    }

    public void clickPhone() {
        waitUntilClickable(listFields.get(4));
        listFields.get(4).click();
    }

    public String getErrorEmailFromList() {
        waitUntilClickable(listErrorMessage.get(0));
        return listErrorMessage.get(0).getText();
    }

    public String getErrorFirstNameFromList() {
        waitUntilClickable(listErrorMessage.get(1));
        return listErrorMessage.get(1).getText();
    }

    public String getErrorLastNameFromList() {
        waitUntilClickable(listErrorMessage.get(2));
        return listErrorMessage.get(2).getText();
    }

    public String getErrorPhoneFromList() {
        waitUntilClickable(listErrorMessage.get(3));
        return listErrorMessage.get(3).getText();
    }

    public String getErrorEmailText() {
        waitUntilClickable(errorEmailMessage.get(0));
        return errorEmailMessage.get(0).getText();
    }
}
