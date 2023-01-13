package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
//
        driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstName")).sendKeys("Mahi");
        Thread.sleep(2000);

        driver.findElement(By.name("lastName")).sendKeys("patil");
        Thread.sleep(2000);

        driver.findElement(By.name("phone")).sendKeys("78555555557");
        Thread.sleep(2000);

        driver.findElement(By.name("userName")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);


        driver.findElement(By.name("address1")).sendKeys("At.post Gunjaraga");
        Thread.sleep(2000);

        driver.findElement(By.name("city")).sendKeys("Nilanga");
        Thread.sleep(2000);

        driver.findElement(By.name("state")).sendKeys("Maharashtra");
        Thread.sleep(2000);

        driver.findElement(By.name("postalCode")).sendKeys("413521");
        Thread.sleep(2000);

        driver.findElement(By.name("country")).sendKeys("India");
        Thread.sleep(2000);

        driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(2000);

        driver.findElement(By.name("confirmPassword")).sendKeys("12345");
        Thread.sleep(2000);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);





        driver.quit();

    }
}
