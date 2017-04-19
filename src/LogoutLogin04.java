import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by DIPAK on 3/18/2017.
 */
public class LogoutLogin04 {
    public static void main(String[] args) {


        WebDriver driver = new FirefoxDriver();
       // Random rn=new Random();
      //  int ans=rn.nextInt(50);
        driver.get("http://demo.nopcommerce.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        DateFormat dateFormat = new SimpleDateFormat("ddHHmmss");
        Date datedj = new Date();
        System.out.println(dateFormat.format(datedj));

        driver.findElement(By.xpath("html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Dipak");
        driver.findElement(By.id("LastName")).sendKeys("togadiya");
        driver.findElement(By.id("Email")).sendKeys("dipak_togadiya"+dateFormat.format(datedj)+"@yahoo.com");
        String email = "dipak_togadiya"+dateFormat.format(datedj)+"@yahoo.com";
        System.out.println(email);

        driver.findElement(By.id("Company")).sendKeys("Dtog");
        driver.findElement(By.id("Password")).sendKeys("D123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("D123456");
        driver.findElement(By.id("register-button")).click();

        String expectedText = "Your registration completed";
        String actualresult = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedText, actualresult);

        driver.findElement(By.className("ico-logout")).click();
        driver.findElement(By.className ("ico-login")).click();

        driver.findElement(By.id("Email")).sendKeys("dipak_togadiya"+dateFormat.format(datedj)+"@yahoo.com");
        driver.findElement(By.id("Password")).sendKeys("D123456");
        driver.findElement(By.xpath("*//form/div[3]/input")).click();
        driver.findElement(By.className("ico-account")).click();


        Assert.assertTrue("Dipak",driver.findElement(By.id("FirstName")).isEnabled());

    }

}