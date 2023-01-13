package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        click();
       tearDown();

    }
    public static void click(){
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
