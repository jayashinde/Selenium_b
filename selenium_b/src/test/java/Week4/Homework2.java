package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/nestedframes");



        WebElement element= driver.findElement(By.className("frame1"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.className("mce-content-body ")).getText());




        driver.quit();

    }



}
