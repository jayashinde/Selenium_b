package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        System.out.println( driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();//back to the original window
        driver.quit();
    }
}
