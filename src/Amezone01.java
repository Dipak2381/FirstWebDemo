import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/19/2017.
 */
public class Amezone01
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //mouse hover on department

        WebElement department= driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[1]"));

        Actions act = new Actions(driver);

        act.moveToElement(department).perform();

        //mouse hover on electronics
        WebElement electronicsComputers= driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[11]/span"));

        Actions act1 = new Actions(driver);

        act.moveToElement(electronicsComputers).perform();

        //click on cemera
        //driver.findElement(By.xpath("//div[@id='nav-flyout-shopAll']/div[3]/div[9]/div/div/a/span")).click();
        // Assert
        //String expectedText = "Digital cameras";
        //String actualText = driver.findElement(By.xpath("//a[contains(text(),'Digital cameras')]")).getText();
        //Assert.assertEquals(expectedText,actualText);
        Assert.assertTrue("Digital cameras",driver.findElement(By.xpath("//div[@class='acs-category-tile-header']/a")).isEnabled());
        System.out.println("Digital cameras");
        // Close Browser
        driver.close();



    }
}
