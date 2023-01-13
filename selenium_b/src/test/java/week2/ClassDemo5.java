package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/hp/Downloads/MyPage.html");

        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Mahi");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Shinde");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shijaya2@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("J4888526");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//textarea[@id='msg']")).sendKeys("java is object oriented language");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='javascript']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='vehicle1']")).click();

        driver.findElement(By.xpath("//input[@id='vehicle2']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
