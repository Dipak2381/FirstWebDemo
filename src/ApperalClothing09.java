import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/23/2017.
 */
public class ApperalClothing09
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        // Open nopcommerce website
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Click on Apparel
        driver.findElement(By.xpath("//a[contains(@href, '/apparel')]")).click();


        // Click on Clothing
        driver.findElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div[2]/div[2]/div/div[2]/div/div/div[2]")).click();

        // Select Sort by Position
        WebElement select_position= driver.findElement(By.id("products-orderby"));
        Select select_pp = new Select(select_position);
        select_pp.selectByVisibleText("Price: Low to High");

        // Select Display
        WebElement select_display = driver.findElement(By.id("products-pagesize"));
        Select select_dd = new Select(select_display);
        select_dd.selectByIndex(0);

        Thread.sleep(1000);

        // Select List
        driver.findElement(By.xpath("//div/div/div[2]/div/div/a[2]")).click();

        // Add to compare list
        driver.findElement(By.xpath("//div[2]/div/div[2]/div[3]/div[2]/input[2]")).click();

        // Close product comparision option
        //driver.findElement(By.className("close")).click();

        Thread.sleep(1000);

        // Add to compare list
        driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input[2]")).click();
        Thread.sleep(1000);

        // Click on product comparision option
        //driver.findElement(By.xpath("//a[@href='/compareproducts']")).click();
        driver.findElement(By.xpath("//div[@id='bar-notification']/p/a")).click();

        // Clear list
        driver.findElement(By.className("clear-list")).click();

        // Assert
        //String expectedText = "You have no items to compare.";
        //String actualText =driver.findElement(By.className("no-data")).getText();
        //Assert.assertEquals(expectedText,actualText);

        Assert.assertTrue("You have no items to compare.",driver.findElement(By.className("no-data")).isEnabled());
        System.out.println("You have no items to compare.");

        // Close Browser
        driver.close();





    }
}
