package org.example.Week1.Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://uitestingplayground.com/textinput");
        driver.findElement(By.id("newButtonName")).sendKeys("java is a simple and platform indenpendent language");
      //  driver.findElement(By.id("updatingButton")).click();
        driver.findElement(By.id("updatingButton")).click();

        Thread.sleep(3000);
        driver.quit();
    }
}
