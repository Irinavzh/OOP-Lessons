package dog;

import org.junit.Assert;
import org.junit.Test;

public class ErrorMassageListTest extends BaseTest {

    @Test
    public void testErrorMassageList() {

        HomePage homePage = new HomePage(driver);
        homePage.clickBookWalkButton();

        ApplyDubPage applyDubPage = new ApplyDubPage(driver);

        applyDubPage.clickEmail();
        applyDubPage.clickPassword();
        applyDubPage.clickFirstName();
        applyDubPage.clickLastName();
        applyDubPage.clickPhone();
        applyDubPage.clickEmail();

        String emailErrorFromList = applyDubPage.getErrorEmailFromList();
        Assert.assertEquals("required", emailErrorFromList);

        String firstNameErrorFromList = applyDubPage.getErrorFirstNameFromList();
        Assert.assertEquals("required", firstNameErrorFromList);

        String lastNameErrorFromList = applyDubPage.getErrorLastNameFromList();
        Assert.assertEquals("required", lastNameErrorFromList);

        String phoneErrorFromList = applyDubPage.getErrorPhoneFromList();
        Assert.assertEquals("required", phoneErrorFromList);

    }
}
