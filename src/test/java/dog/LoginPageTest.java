package dog;

import org.junit.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginPage() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLoginButton();

        LoginPage loginPage = new LoginPage(driver);
    }
}
