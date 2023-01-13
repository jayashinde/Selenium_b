package org.example.Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("file:///C:/Users/hp/Downloads/MyPage.html");
        driver.manage().window().maximize();

         WebElement firstname= driver.findElement(By.id("fname"));
        firstname.sendKeys("Jayshree");

         WebElement lastname=driver.findElement(By.id("lname"));
         lastname.sendKeys("Shinde");

         WebElement email=  driver.findElement(By.id("email"));
         email.sendKeys("shijayashri9@gmail.com");

       WebElement pass=  driver.findElement(By.id("password"));
       pass.sendKeys("Jaya@12345");

     WebElement msg=  driver.findElement(By.id("msg"));
       msg.sendKeys("Welcome to the page jaya");

       WebElement language=driver.findElement(By.id("javascript"));
       language.click();
       Thread.sleep(3000);

      WebElement vehicle= driver.findElement(By.id("vehicle1"));
      vehicle.click();
    Thread.sleep(3000);
     WebElement vehicle2= driver.findElement(By.id("vehicle2"));
     vehicle2.click();
  Thread.sleep(3000);
   WebElement Sub=  driver.findElement(By.xpath("/html/body/form/input[11]"));
    Sub.click();
    driver.quit();








    }
}
