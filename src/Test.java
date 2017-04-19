import com.thoughtworks.selenium.Selenium;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.security.PKCS12Attribute;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/19/2017.
 */
public class Test
{
    public static void main(String[] args) throws IOException {



        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd hh mm ss");
        Date datedj = new Date();
        System.out.println(dateFormat.format(datedj));

       // driver.close();

        //  Calendar calendar = Calendar.getInstance();
        //  java.sql.Date currentTimestamp = new java.sql.Date(calendar.getTime().getTime());
        // java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");



        //assert function
        String expectedText = "Your registration completed";
        String actualresult = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedText,actualresult);
        //assert 2
        Assert.assertTrue("Dipak",driver.findElement(By.id("FirstName")).isEnabled());


        // String expectedText="Guru99 Bank";
        String actualResult =driver.findElement(By.className("barone")).getText();
        Assert.assertEquals(expectedText,actualResult);
      //// Select country name
        WebElement select_country = driver.findElement(By.id("CountryId"));
        Select select_cc = new Select(select_country);
        select_cc.selectByVisibleText("United Kingdom");
        //// Select Sort by Position
        WebElement select_position= driver.findElement(By.id("products-orderby"));
        Select select_pp = new Select(select_position);
        select_pp.selectByVisibleText("Price: Low to High");

        // Select Display
        WebElement select_display = driver.findElement(By.id("products-pagesize"));
        Select select_dd = new Select(select_display);
        select_dd.selectByIndex(0);
        // // TakeScreenShot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\screenshot\\photo.png"));
        System.out.println("TakeScreenshot_12 Taking");



    }
}
