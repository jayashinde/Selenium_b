package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class2 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
        test();
        tearDown(); // close the browser
    }

    private static void test() throws InterruptedException {
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement email = driver.findElement(By.id("Email"));
        Actions actions = new Actions(driver);
        driver.findElement(By.xpath("// label[@for='RememberMe']")).click();
        Thread.sleep(3000);
        actions.click(email).perform();
        Thread.sleep(3000);
        actions.contextClick(email).perform();
        Thread.sleep(3000);
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
