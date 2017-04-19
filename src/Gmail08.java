import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/23/2017.
 */
public class Gmail08 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://accounts.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // time and date
        DateFormat dateFormat = new SimpleDateFormat("ddHHmmss");
        Date date = new Date();
        // Create a new account
        driver.findElement(By.xpath("//span[@id='link-signup']/a")).click();
        // First name
        driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Harry");
        // Last name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Java");
        // Email ID
        driver.findElement(By.xpath("//input[@id='GmailAddress']")).sendKeys("harryjava67@gmail.com");
        // Password
        driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("Harryjava@40");
        // Confirm Password
        driver.findElement(By.xpath("//input[@id=\"PasswdAgain\"]")).sendKeys("Harryjava@40");
        // Enter Month
        driver.findElement(By.xpath("//label[@id='month-label']/span/div")).sendKeys("January");
        //  Enter day
        driver.findElement(By.id("BirthDay")).sendKeys("25");
        //  Enter Year
        driver.findElement(By.xpath("//label[@id='year-label']/input")).sendKeys("1978");
        // Gender
        driver.findElement(By.xpath("//div[@id='Gender']/div")).sendKeys("Male");
        // Enter Location
        driver.findElement(By.xpath("//div[@id=':i']")).sendKeys("United Kingdom");
        driver.findElement(By.xpath("//input[@id='submitbutton']")).click();
        // Click on agree button
        driver.findElement(By.className("tos-scroll-button-icon")).click();
        driver.findElement(By.className("tos-scroll-button-icon")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("tos-scroll-button-icon")).click();
        // Click on T & C Agree
        driver.findElement(By.id("iagreebutton")).click();



        // Close Browser
        driver.close();


    }
}