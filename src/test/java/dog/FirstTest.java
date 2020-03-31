package dog;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends BaseTest {

    @Test
    public void testFirst() throws InterruptedException {

        System.out.println("FirstTest Started.");

        Thread.sleep(3000);

        WebElement emailField = driver.findElement(By.cssSelector("input[name=\"email\"]"));

        emailField.sendKeys("irinavzh@gmail.com");

        WebElement passwordField = driver.findElement(By.cssSelector("input[name=\"password\"]"));

        passwordField.sendKeys("Password13%&");

        WebElement firstNameField = driver.findElement(By.cssSelector("input[name=\"firstName\"]"));

        firstNameField.sendKeys("Irina");

        WebElement lastNameField = driver.findElement(By.cssSelector("input[name=\"lastName\"]"));

        lastNameField.sendKeys("Zhu");

        WebElement cellPhoneField = driver.findElement(By.cssSelector("input[name=\"phone\"]"));

        cellPhoneField.sendKeys("2223334455");

        System.out.println("FirstTest Completed.");
    }
}
