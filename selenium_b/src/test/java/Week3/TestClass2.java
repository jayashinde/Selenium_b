package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass2 {
   static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
         setup();

        operation();

        tearDown();


    }

    private static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    private static void operation() throws InterruptedException {
        WebElement element= driver.findElement(By.xpath("//select[@id=\"first\"]"));
        Select select=new Select(element);
        //by visible text
        select.selectByVisibleText("Bing");
        Thread.sleep(2000);
        //by index
        select.selectByIndex(1);
        Thread.sleep(2000);
        //by value
        select.selectByValue("Apple");
    }

    private static void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }
}
