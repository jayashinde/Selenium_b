package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ClassDemo2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/switch-window");
        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("new-tab-button")).click();

        Set<String> handles = driver.getWindowHandles();

        for (String windowName : handles) {
            driver.switchTo().window(windowName);
            String url = driver.getCurrentUrl();
            if (!url.equals("https://formy-project.herokuapp.com/")) {     //ToolsQA

                System.out.println(driver.getCurrentUrl());
            }}




    }
}
