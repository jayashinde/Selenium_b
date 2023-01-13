package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlartDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        //simple alert
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
      Alert alert = driver.switchTo().alert();
      Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);


    }
}