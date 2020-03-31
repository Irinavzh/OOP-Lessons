package dog;

import org.junit.Assert;
import org.junit.Test;

public class ErrorMessageTest extends BaseTest {

    @Test
    public void testErrorMessage() {

        HomePage homePage = new HomePage(driver);
        homePage.clickBookWalkButton();

        ApplyPage applyPage = new ApplyPage(driver);

        applyPage.clickEmailField();
        applyPage.clickFirstName();
        applyPage.clickLastName();
        applyPage.clickPhoneField();
        applyPage.clickEmailField();

        String emailError = applyPage.getErrorEmail();
        Assert.assertEquals("required", emailError);

        String firstNameError = applyPage.getErrorFirstName();
        Assert.assertEquals("required", firstNameError);

        String lastNameError = applyPage.getErrorLastName();
        Assert.assertEquals("required", lastNameError);

        String phoneError = applyPage.getErrorPhone();
        Assert.assertEquals("required", phoneError);
    }
}
