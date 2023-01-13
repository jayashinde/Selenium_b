package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

 //   String  str  = driver.getWindowHandle();


        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println("****************************************************");

        driver.findElement(By.id("windowButton")).click();

      Set<String> handles = driver.getWindowHandles();


        for (String handle:handles) {
            driver.switchTo().window(handle);
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
        }


             Thread.sleep(2000);
             driver.quit();

    }
}











