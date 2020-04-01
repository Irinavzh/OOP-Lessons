package dog;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ApplyDubTest extends BaseTest {

    @Test
    public void testApplyDub() {

        HomePage homePage = new HomePage(driver);

        ApplyDubPage applyDubPage = homePage.clickBookWalkButton();

        System.out.println(driver.getTitle());


        applyDubPage.inputEmail(user.getEmailUser());

        applyDubPage.inputPassword(user.getPasswordUser());

        applyDubPage.inputFirstName(user.getFirstNameUser());

        applyDubPage.inputLastName(user.getLastNameUser());

        applyDubPage.inputPhone(user.getCellPhoneUser());
    }
}
