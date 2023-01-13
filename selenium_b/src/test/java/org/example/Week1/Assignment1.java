package org.example.Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

         driver.get("https://demowebshop.tricentis.com/register");
         WebElement register= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        register.click();
      WebElement gender=  driver.findElement(By.id("gender-female"));
        gender.click();

       WebElement fname= driver.findElement(By.id("FirstName"));
       fname.sendKeys("Jaya");
       Thread.sleep(3000);

      WebElement lname= driver.findElement(By.id("LastName"));
      lname.sendKeys("Shinde");
      Thread.sleep(3000);

    WebElement email=  driver.findElement(By.id("Email"));
    email.sendKeys("shijayashri9@gmail.com");
    Thread.sleep(2000);

    WebElement pass =driver.findElement(By.id("Password"));
    pass.sendKeys("7758900181");
    Thread.sleep(2000);

    WebElement pass1=driver.findElement(By.id("ConfirmPassword"));
    pass1.sendKeys("7758900181");
    Thread.sleep(2000);


   WebElement element= driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
   element.click();
    }
}
