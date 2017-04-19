import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/18/2017.
 */
public class TimeStamp03 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.className("ico-register")).click();


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
        Assert.assertEquals(expectedText, actualresult);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

      //  Calendar calendar = Calendar.getInstance();
      //  java.sql.Date currentTimestamp = new java.sql.Date(calendar.getTime().getTime());
       // java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");

    }

}
