package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MypageDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/hp/Downloads/MyPage.html");

         driver.findElement(By.cssSelector("input#fname")).sendKeys("Mahi");
         Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#lname")).sendKeys("Shinde");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#email")).sendKeys("shijaya2@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("J4888526");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("textarea#msg")).sendKeys("java is object oriented language");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#javascript")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#vehicle1")).click();

        driver.findElement(By.cssSelector("input#vehicle2")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

            Thread.sleep(2000);
        driver.quit();
    }
}
