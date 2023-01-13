package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Windowdemo1 {
  static   WebDriver driver ;
    public static void main(String[] args) throws InterruptedException {

       setup();

        clickOn();

        tearDown();


    }

    private static void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

    private static void clickOn() {
        driver.manage().window().maximize();
        driver.findElement(By.id("windowButton")).click();
       Set<String> handles = driver.getWindowHandles();
        for (String str:handles) {
            driver.switchTo().window(str);
            System.out.println(str);
            System.out.println(driver.getCurrentUrl());

            System.out.println(driver.getTitle());

            System.out.println("***********************************");

//            driver.findElement(By.id("messageWindowButton")).click();
//            Set<String> handles1= driver.getWindowHandles();
//            for (String str2:handles1) {
//                driver.switchTo().window(str2);
//
//            }
//



        }




    }

    private static void setup() {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

    }
}
