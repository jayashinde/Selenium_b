package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;




public class AutomationDemo2 {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
         setup();


        login();
        tearDown();


    }

    private static void tearDown() throws InterruptedException {
        Thread.sleep(2000);

        //  Thread.sleep(2000);
        driver.quit();
    }

    private static void login() throws InterruptedException {
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Shree");
        //    Thread.sleep(2000);

        driver.findElement(By.id("LastName")).sendKeys("shinde");
        //   Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("Test1212126112@test.com");
        //   Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("test12345");
        //  Thread.sleep(2000);
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test12345");
        //   Thread.sleep(2000);
        driver.findElement(By.id("register-button")).click();
        //   Thread.sleep(2000);


        driver.findElement(By.xpath("//a[@href='/login']")).click();
         Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("Test1212126112@test.com");
        Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("test12345");
        Thread.sleep(2000);
        driver.findElement(By.id("RememberMe")).click();
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
         Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='/apparel-shoes']    ")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[contains(@onclick,'40')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("topcartlink")).click();
         Thread.sleep(1000);

         driver.findElement(By.name("removefromcart")).click();
         Thread.sleep(1000);

         driver.findElement(By.id("termsofservice")).click();
         Thread.sleep(1000);

         driver.findElement(By.id("checkout")).click();
         Thread.sleep(1000);

         driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("Anyone");
         Thread.sleep(1000);
        WebElement select= driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select1=new Select(select);
        select1.selectByValue("41");


       WebElement elemen= driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
       Select select2=new Select(elemen);
       select2.selectByValue("0");

       driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Latur");
       driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Latur");
       driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("Latur");
       driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("588988");
       driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("5889654852");
       driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("54489");

    driver.findElement(By.xpath("//div[contains(@id,'billing-buttons-container')]")).click();
   //  driver.findElement(By.id("PickUpInStore")).click();


//
//        WebElement firstResult4 = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"billing-buttons-container\\\"]/input\"")));
//
//        System.out.println(firstResult4.getText());
//
//



    }

    private static void setup() {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");

    }
}
