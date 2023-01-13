package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.className("pHiOh")).click();
        String str=driver.getTitle();
        Thread.sleep(2000);
        System.out.println(str);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
     //  driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).click();
       driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.c93Gbe > div.KxwPGc.SSwjIe > div.KxwPGc.AghGtd > a:nth-child(1)")).click();
           Thread.sleep(2000);
        //driver.findElement(By.className("pHiOh")).click();
        String str2=driver.getTitle();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.name("q")).sendKeys("Test");
        Thread.sleep(2000);

        driver.quit();
    }
}
