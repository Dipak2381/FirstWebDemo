import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/23/2017.
 */
public class YoutubeVideo10
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Type in Search box
        driver.findElement(By.id("masthead-search-term")).sendKeys("take screenshot of failed test cases");
        // Click search box
        driver.findElement(By.id("search-btn")).click();
        // Click on Mukesh Otwani Video
        driver.findElement(By.xpath("//a[@title='How to take screenshot of failed test cases in Selenium Webdriver']")).click();
        //xpath=//input[contains(@id, "searchInput")]
        // Close Browser
       // driver.close();
    }
}
