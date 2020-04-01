package dog;

import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
    }
}