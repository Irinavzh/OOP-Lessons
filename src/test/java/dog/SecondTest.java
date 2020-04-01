package dog;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SecondTest extends BaseTest {


    @Test
    public void testSecond() throws InterruptedException {

        System.out.println("SecondTest Started.");

        HomePage homePage = new HomePage(driver);
        homePage.clickBookWalkButton();

        Thread.sleep(3000);

        List<WebElement> inputFields = driver.findElements(By.cssSelector("input"));

        /*
        [0] - emailField
        [1] - passwordField
        [2] - firstNameField
        [3] - lastNameField
        [4] - cellPhoneField
         */

        inputFields.get(0).sendKeys(user.getEmailUser());

        inputFields.get(1).sendKeys(user.getPasswordUser());

        inputFields.get(2).sendKeys(user.getFirstNameUser());

        inputFields.get(3).sendKeys(user.getLastNameUser());

        inputFields.get(4).sendKeys(user.getCellPhoneUser());

        System.out.println("SecondTest Completed.");

    }
}
