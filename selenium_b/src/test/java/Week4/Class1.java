package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
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
        actions.sendKeys(email, "test").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE)
                .sendKeys(Keys.BACK_SPACE)
                .perform();

        actions.keyDown(Keys.SHIFT)
                .sendKeys(email, "test@ttt.com")
                .keyUp(Keys.SHIFT)
                .perform();

        actions.keyDown(Keys.SHIFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT)
                .perform();
        Thread.sleep(3000);
        actions.sendKeys(Keys.TAB)
                .sendKeys("test1234")

                .perform();
//press tab to navigate to password field
// enter password and click on login
        Thread.sleep(4000);

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
