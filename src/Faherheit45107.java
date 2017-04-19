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
public class Faherheit45107 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();

        // Open Website
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Click on Books main menu
        driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
        // Click on Fahrenheit 451 books on left side list
        driver.findElement(By.xpath("//a[contains(text(),'Fahrenheit 451 by Ray Bradbury')]")).click();
        // Add Quantity
        driver.findElement(By.id("addtocart_37_EnteredQuantity")).sendKeys("4");
        // Add to Wishlist
        driver.findElement(By.id("add-to-wishlist-button-37")).click();
        // Continue on click wishlist
        driver.findElement(By.xpath("html/body/div[5]/p/a")).click();
        // Clear Quantity
        driver.findElement(By.className("qty-input")).clear();
        // Update Quantity
        driver.findElement(By.className("qty-input")).sendKeys("4");
        // Update Cart
        driver.findElement(By.name("updatecart")).click();
        // Click on Checkbox
        driver.findElement(By.name("addtocart")).click();
        // Add to Cart
        driver.findElement(By.name("addtocartbutton")).click();
        // Click on T&C
        driver.findElement(By.id("termsofservice")).click();
        // Select country name
        WebElement select_country = driver.findElement(By.id("CountryId"));
        Select select_cc = new Select(select_country);
        select_cc.selectByVisibleText("United Kingdom");
        // Click on State
        driver.findElement(By.id("StateProvinceId")).sendKeys("london");
        // Click on Zip Code
        driver.findElement(By.id("ZipPostalCode")).sendKeys("SE1 1NO");
        // Click to Checkout
        driver.findElement(By.id("checkout")).click();
        // Click checkout as a guest
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/input[1]")).click();
        // Fill  First name
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("harry");
        // Fill Last name
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("java");
        // Fill E-mail
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("harjay@gamil.com");
        // Fill Country
        WebElement select_country1 = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select_cc1 = new Select(select_country1);
        select_cc1.selectByVisibleText("United Kingdom");
        // Fill City Name
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("London");
        // Fill Address
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("4-5 High Street");
        // Fill Zip Code
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("SE1 1NO");
        //Fill Phone Number
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("00000000");
        // Click on Continue Button
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        // Click on Continue Button
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/input")).click();
        // Select Payment Method
        driver.findElement(By.id("paymentmethod_1")).click();
        // Select Continue
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/input")).click();
        // Select Credit Card
        driver.findElement(By.id("CreditCardType")).sendKeys("Mastercard");
        // Select Cardholder Name
        driver.findElement(By.id("CardholderName")).sendKeys("Harry");
        // Select Card Number
        driver.findElement(By.id("CardNumber")).sendKeys("5415326444036252");
        // Select Expire Month
        driver.findElement(By.id("ExpireMonth")).sendKeys("02");
        // Select Expire Year
        driver.findElement(By.id("ExpireYear")).sendKeys("2019");
        // Select Card Code
        driver.findElement(By.id("CardCode")).sendKeys("003");
        // Select Continue
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();
        // Select Continue
        driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/input")).click();
        // Select Confirm
        driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/input")).click();
        // Assert
        Assert.assertTrue("Your order has been successfully processed!", driver.findElement(By.xpath("html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).isEnabled());
        System.out.println("Your order has been successfully processed!");
        //Close Browser
        driver.close();

    }
}