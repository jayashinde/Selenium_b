package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ClassDemo13 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
// String valueToSelect = "Option 1";
// test(valueToSelect); // login steps
        test();
        tearDown(); // close the browser
    }
    private static void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement dropdownList = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdownList);

        select.selectByVisibleText("Option 1"); // text for option to select
        Thread.sleep(2000);
        select.selectByValue("2"); // using value of value attribute
        Thread.sleep(2000);
        select.selectByIndex(1); // using index starting at 0
        Thread.sleep(2000);

        List<WebElement> options = select.getOptions();
        for (WebElement element : options) {
            System.out.println(element.getText());

        }
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
