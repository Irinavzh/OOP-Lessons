package dog;

import org.junit.Test;

public class ApplyTest extends BaseTest {

    @Test
    public void testApply() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.inputEmail(user.getEmailUser());

        applyPage.inputPassword(user.getPasswordUser());

        applyPage.inputFirstName(user.getFirstNameUser());

        applyPage.inputLastName(user.getLastNameUser());

        applyPage.inputPhone(user.getCellPhoneUser());
    }
}
