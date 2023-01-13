package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment21 {
static WebDriver driver ;
    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
        test();
        tearDown(); // close the browser
    }
    private static void test() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        WebElement sourceElement = driver.findElement(By.className("button button-orange"));

        WebElement targetElement = driver.findElement(By.id("bank"));

                Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement,targetElement).perform();
        Thread.sleep(2000);
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
