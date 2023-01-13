package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        driver.findElement(By.cssSelector("a[href=\"/register\"]")).click();
        Thread.sleep(2000);

     driver.findElement(By.cssSelector("input[id=\"gender-female\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id=\"FirstName\"]")).sendKeys("Mahi");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[id=\"LastName\"]")).sendKeys("Shinde");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#Email[data-val=\"true\"]")).sendKeys("jaya@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id=\"Password\"]")).sendKeys("545899866");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[id=\"LastName\"]")).sendKeys("Shinde");
        Thread.sleep(2000);




   driver.quit();
    }
}
