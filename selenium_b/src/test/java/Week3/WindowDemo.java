package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowDemo {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
        test();
        tearDown(); // close the browser
    }
    private static void test() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(2000);

        Set<String> handles = driver.getWindowHandles();
        for (String str : handles ){
            driver.switchTo().window(str);
            System.out.println(str);
            System.out.println(driver.getCurrentUrl());

            System.out.println(driver.getTitle());
        }
        Thread.sleep(2000);
    }

    private static void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }
    private static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    
}
