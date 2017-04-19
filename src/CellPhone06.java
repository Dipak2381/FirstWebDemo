import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/19/2017.
 */
public class CellPhone06
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //click on electronic
        driver.findElement(By.xpath("//a[@href='/electronics']")).click();
       // driver.findElement(By.xpath("'/li[2]/a'")).click();
        //click cellphone
         driver.findElement(By.xpath("//div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();

        // driver p1 = "driver.findElement(By.className("price actual-price firepath-matching-node")).getText()";

       // System.out.println(p1);

        //click on price value

        driver.findElement(By.cssSelector("span.price.actual-price")).click();

        //click on 1 add to cart
//
        driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
        driver.findElement(By.className("close")).click();
        Thread.sleep(1000);
        //click on price value
        driver.findElement(By.xpath("//div[2]/div/div[2]/div[3]/div/span")).getText();
        //click on 2 add to cart
        driver.findElement(By.xpath("//div[2]/div/div[2]/div[3]/div[2]/input")).click();
        driver.findElement(By.className("close")).click();
        Thread.sleep(1000);
        //click on price value
       // driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/span")).getText();
        Thread.sleep(1000);
       //click on 3 add to cart
        driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input")).click();
       // driver.findElement(By.className("close")).click();

        driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div/span")).getText();
        //click on shopping cart
        driver.findElement(By.linkText("shopping cart")).click();

        // Assert
        Assert.assertTrue("Total",driver.findElement(By.xpath("//tr[@class='order-total']/td")).isEnabled());
        System.out.println("Total:$694.00");
        // Close Browser
        driver.close();

    }
}
