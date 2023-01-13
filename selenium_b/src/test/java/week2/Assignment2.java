package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/hp/Downloads/MyPage.html");

        driver.findElement(By.name("fname")).sendKeys("Jaya");

        driver.findElement(By.name("lname")).sendKeys("shinde");
        Thread.sleep(2000);
      //  driver.findElement(By.name("fname")).sendKeys("jayashri8@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jayashri8gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("548555");
     //   driver.findElement(By.name("fname")).sendKeys("jayashree1234");
        Thread.sleep(2000);
        driver.findElement(By.name("user_message")).sendKeys("hello jaya... ");
         Thread.sleep(2000);

         driver.findElement(By.name("fav_language")).click();
          Thread.sleep(2000);
        driver.findElement(By.name("vehicle1")).click();
          driver.findElement(By.name("vehicle2")).click();
          driver.findElement(By.xpath("/html/body/form/input[11]")).click();
Thread.sleep(2000);
           driver.quit();

    }
}
