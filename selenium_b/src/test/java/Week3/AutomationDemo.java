package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AutomationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");


        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Mahi");
      //  Thread.sleep(2000);

        driver.findElement(By.id("LastName")).sendKeys("shinde");
      //  Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("Test121212611@test.com");
      //  Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("test12345");
      //  Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test12345");
      //  Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".ico-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("Test121212611@test.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("test12345");
        Thread.sleep(3000);
         driver.findElement(By.id("RememberMe")).click();
        Thread.sleep(2000);
         driver.findElement(By.cssSelector(".button-1.login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/apparel-shoes']    ")).click();
        Thread.sleep(3000);



        driver.findElement(By.xpath("//input[contains(@onclick,'36')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[@class='ico-cart']   ")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("removefromcart")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("termsofservice")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Brand");
        Thread.sleep(2000);
        WebElement  element=driver.findElement(By.name("BillingNewAddress.CountryId"));
        Select select=new Select(element);
        select.selectByValue("41");
        Thread.sleep(2000);





        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Pune");
        Thread.sleep(2000);
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Latur");
        Thread.sleep(2000);
        driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Latur");
        Thread.sleep(2000);
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("413521");
        Thread.sleep(2000);
         driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("85684852565");
        Thread.sleep(2000);
         driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("2222");
        Thread.sleep(2000);

      // driver.findElement(By.cssSelector("//input[contains(@onclick,'Billing.save()')]")).click();
       //  Thread.sleep(2000);




//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='billing-buttons-container']//input")));
//        System.out.println("hello");
//        driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input")).click();


        driver.quit();






    }
}
