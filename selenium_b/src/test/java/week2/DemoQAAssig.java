package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQAAssig {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/links");
        Thread.sleep(2000);


        System.out.println("get title :"+ driver.getTitle());
        System.out.println("get url:" + driver.getCurrentUrl());

        driver.findElement(By.cssSelector("a[id=\"created\"]")).click();

        //Thread.sleep(2000);
        driver.navigate().back();

         driver.findElement(By.xpath("//a[@id=\"no-content\"]")).click();
         driver.navigate().back();




        driver.quit();

    }
}
