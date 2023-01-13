package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
   setup();
   checkbox();
   tearDown();

    }
    public static void checkbox(){
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();

    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(30000);
   driver.quit();
    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
