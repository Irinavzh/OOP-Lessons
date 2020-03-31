package dog;

import org.junit.Test;

public class ApplyDubTest extends BaseTest {

    @Test
    public void testApplyDub() {

        HomePage homePage = new HomePage(driver);

        homePage.clickBookWalkButton();

        ApplyDubPage applyDubPage = new ApplyDubPage(driver);

        applyDubPage.inputEmail(user.getEmailUser());

        applyDubPage.inputPassword(user.getPasswordUser());

        applyDubPage.inputFirstName(user.getFirstNameUser());

        applyDubPage.inputLastName(user.getLastNameUser());

        applyDubPage.inputPhone(user.getCellPhoneUser());
    }
}
