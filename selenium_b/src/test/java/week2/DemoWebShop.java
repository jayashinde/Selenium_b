package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoWebShop {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/register");

        System.out.println(driver.getTitle());
        List<WebElement> links =  driver.findElements(By.tagName("a"));

        System.out.println("No of links of the given page: "+ links.size());

        for (WebElement element: links) {
            System.out.println("Text:"+element.getText()+ "url"+element.getAttribute("href"));
        }

          Thread.sleep(2000);
        driver.quit();
    }
}
