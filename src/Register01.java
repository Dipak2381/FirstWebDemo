import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/18/2017.
 */
public class Register01
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Dipak");
        driver.findElement(By.id("LastName")).sendKeys("togadiya");
        driver.findElement(By.id("Email")).sendKeys("dipak_togadiya@yahoo.com");
        driver.findElement(By.id("Company")).sendKeys("Dtog");
        driver.findElement(By.id("Password")).sendKeys("D123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("D123456");
        driver.findElement(By.id("register-button")).click();
        String expectedText = "Your registration completed";
        String actualresult = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedText,actualresult);











    }
}

