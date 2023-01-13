package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/links");

        driver.findElement(By.id("created")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("no-content")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("moved")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("bad-request")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("unauthorized")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("forbidden")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("invalid-url")).click();
        Thread.sleep(2000);


    driver.quit();


    }
}
