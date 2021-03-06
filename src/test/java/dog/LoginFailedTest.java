package dog;

import org.junit.Assert;
import org.junit.Test;

public class LoginFailedTest extends BaseTest {

    @Test
    public void testLoginFailed() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);

        loginPage.inputEmail(user.getEmailUser());
        loginPage.inputPassword(user.getPasswordUser());
        loginPage.clickLoginButton();

        String errorMessageText = loginPage.getErrorText();
        System.out.println(errorMessageText);
        Assert.assertEquals("Authentication Failed", errorMessageText);

    }

}
