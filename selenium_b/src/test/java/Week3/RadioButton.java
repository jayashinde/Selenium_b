package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        driver.findElement(By.xpath("//input[@value='option2']")).click();
        Thread.sleep(2000);




        driver.quit();
    }
}
