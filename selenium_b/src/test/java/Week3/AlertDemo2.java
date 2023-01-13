package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
      String s= alert1.getText();
        System.out.println(s);
        Thread.sleep(2000);
        alert1.dismiss();
      //  alert1.accept();
       // Thread.sleep(5000);
        // driver.quit();
    }
}
