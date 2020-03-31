package dog;

import org.junit.Assert;
import org.junit.Test;

public class ApplyEmailErrorTest extends BaseTest {

    @Test
    public void testApplyEmailError() {

        HomePage homePage = new HomePage(driver);
        ApplyDubPage applyDubPage = homePage.clickBookWalkButton();

        applyDubPage.inputEmail("kasdgc;kqgd;g");

        applyDubPage.clickFirstName();

        String error = applyDubPage.getErrorEmailText();
        Assert.assertEquals("please provide a valid email", error);
    }
}
