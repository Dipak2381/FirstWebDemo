package CaptureScrrenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/21/2017.
 */
public class FacebookScreenshot
{
    public static void main(String[] args) throws IOException

    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Dipak_togadiya@yahoo.com");

        TakesScreenshot ts=(TakesScreenshot)driver;
        File source =ts.getScreenshotAs(OutputType.FILE);
        //file (predefine class), get screenshotas =pre define method)
        FileUtils.copyFile(source,new File("C:\\Screenshot\\photo.png"));
        System.out.println("screenshot Taking");
        driver.quit();

    }
}
