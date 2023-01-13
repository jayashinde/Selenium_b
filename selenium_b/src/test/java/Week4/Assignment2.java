package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        driver.findElement(By.id("new-tab-button")).click();

    Set<String> handes=   driver.getWindowHandles();
        for (String store:handes) {
            driver.switchTo().window(store);
            System.out.println(driver.getCurrentUrl());
        }

     driver.quit();

    }
}
