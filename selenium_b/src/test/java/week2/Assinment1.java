package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assinment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.className("ico-register")).click();
        Thread.sleep(2000);
      //  driver.findElement(By.name("Gender")).click();
        driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
        Thread.sleep(2000);
     //   driver.findElement(By.className("FirstName")).sendKeys("Jayashri");
        driver.findElement(By.name("FirstName")).sendKeys("Jayshree");
        Thread.sleep(2000);
        driver.findElement(By.name("LastName")).sendKeys("Shinde");
        Thread.sleep(2000);
        driver.findElement(By.name("Email")).sendKeys("shjayashri9@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("Password")).sendKeys("77589001811");
        Thread.sleep(2000);
        driver.findElement(By.name("ConfirmPassword")).sendKeys("77589001811");
        Thread.sleep(2000);
        driver.findElement(By.name("register-button")).click();

        driver.quit();
    }
}
