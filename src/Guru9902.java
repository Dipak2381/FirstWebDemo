import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/18/2017.
 */
public class Guru9902
{
    public static void main(String[] args)
    {
        WebDriver driver =new FirefoxDriver();
        driver.get("http://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("uid")).sendKeys("mngr70702");
        driver.findElement(By.name("password")).sendKeys("ygYvyvA");
        driver.findElement(By.name("btnLogin")).click();
        String expectedText="Guru99 Bank";
        String actualResult =driver.findElement(By.className("barone")).getText();
        Assert.assertEquals(expectedText,actualResult);



    }
}
