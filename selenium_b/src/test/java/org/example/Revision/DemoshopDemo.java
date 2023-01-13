package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoshopDemo {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        login();
        tearDown();
    }
    public static void login(){
        driver.get("https://demowebshop.tricentis.com/");
      driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("jaya");
        driver.findElement(By.id("LastName")).sendKeys("shinde");
        driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("test123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("test123");
        driver.findElement(By.id("register-button")).click();



    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(1000);
   driver.quit();

    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
