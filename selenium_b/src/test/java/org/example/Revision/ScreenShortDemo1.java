package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShortDemo1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/register");

        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("nitin");
        driver.findElement(By.id("LastName")).sendKeys("Bhingole");
        driver.findElement(By.id("Email")).sendKeys("nitin12@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("susmita@123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("susmita@123");
        driver.findElement(By.id("register-button")).click();

        Thread.sleep(2000);

        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
       File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
       File target= new File("src/test/resources/register.png");
        FileUtils.copyFile(source,target);


    }
}
