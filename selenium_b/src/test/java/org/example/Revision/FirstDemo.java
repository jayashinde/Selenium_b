package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        login();
        tearDown();
    }
    public static void login(){
  driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@name='q']")).click();
    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium doc");
    driver.findElement(By.xpath("//div[@class='pcTkSc']")).click();

    }
    public static void tearDown() throws InterruptedException {
//   driver.quit();
//   Thread.sleep(1000);
    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
