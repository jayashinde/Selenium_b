package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumDemo {

    public static void main(String[] args) throws InterruptedException {
  WebDriverManager.chromedriver().setup();
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.selenium.dev/blog/");

        System.out.println("get title :"+ driver.getTitle());
        System.out.println("get url:" + driver.getCurrentUrl());

        driver.findElement(By.cssSelector("a[href=\"/downloads\"]")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.cssSelector("a[href=\"/documentation\"]")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.cssSelector("a[href=\"/projects\"]")).click();
        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.cssSelector("a[href=\"/support\"]")).click();

        Thread.sleep(2000);
        driver.navigate().back();

       driver.quit();
        //driver.close();

    }


    }


