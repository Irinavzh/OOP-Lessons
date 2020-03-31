package dog;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;
    protected static User user;

    @BeforeClass
    public static void setUp() {

        System.out.println("SetUp Test Started.");

        System.setProperty("webdriver.chrome.driver", "/Users/kotenok/Desktop/driver/chromedriver");

        driver = new ChromeDriver();

        user = new User("ira@gmail.com", "Password1", "Irina", "Zhu",
                "4012223344");

        driver.get("https://wagwalking.com/");

        String expectedTitle = "WagWalking.com - Leading Local Dog Walker Service for Dog Owners";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

        System.out.println("Title Test Passed");

    }

    @AfterClass
    public static void tearDown() {

        System.out.println("Test Completed.");

        driver.quit();
    }
}
