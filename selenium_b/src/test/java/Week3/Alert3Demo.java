package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3Demo {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
        test();
        tearDown(); // close the browser
    }
    private static void test() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("XYZ");
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.accept();
// alert.dismiss();
        System.out.println(driver.findElement(By.id("promptResult")).getText());
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
