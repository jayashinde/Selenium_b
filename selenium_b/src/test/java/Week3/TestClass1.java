package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestClass1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup();
        operation();
        dearDown();

    }

    private static void dearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    private static void operation() throws InterruptedException {
      driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
     driver.manage().window().maximize();

      WebElement elementy=driver.findElement(By.xpath("//select[@id=\"second\"]"));

    Select select=new Select(elementy);
        //Byvalue
        select.selectByValue("pizza");
        Thread.sleep(2000);
        //ByIndex
        select.selectByVisibleText("Donut");
        Thread.sleep(2000);

        select.selectByIndex(2);
        Thread.sleep(2000);

        List<WebElement> list = select.getOptions();
        for (WebElement select1:list) {
            System.out.println(select1.getText());
        }

    }

    private static void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
}
