package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("checkbox-2")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
