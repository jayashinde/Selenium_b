package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.xpath("//a[@href='/register']")).click();
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("jaya");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='FirstName']")).clear();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("shinde");
        driver.findElement(By.xpath("//input[@id='LastName']")).clear();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shijaya@gmail.com");
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        Thread.sleep(2000);


        driver.quit();





    }
}
