package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebElementDemo {
    static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup();
        submit();
        tearDown();
        //tag name to find a single element
    }
    private static void setup() {
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/documentation/");

    }
    private static void submit() throws InterruptedException {
        System.out.println(driver.getTitle());
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("No of links of the given page: " + links.size());

        for (WebElement element : links) {
            System.out.println("Text:" + element.getText() + "url" + element.getAttribute("href"));
        }
    }

    private static void tearDown() throws InterruptedException {
        driver.quit();
    }
}
