package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.cssSelector(".ico-logout")).click();
        driver.findElement(By.xpath(""));


        driver.findElement(By.name("removefromcart")).click();

    }
}
