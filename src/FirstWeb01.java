import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/18/2017.
 */
public class FirstWeb01
{
    public static void main(String[] args)
    {
        WebDriver driver =new FirefoxDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dtogadiya@gmail.com");

        driver.findElement(By.id("Passwd")).sendKeys("23loveb81");

    }

}
