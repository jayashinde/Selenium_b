package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        driver.manage().window().maximize();
       WebElement element =driver.findElement(By.xpath("//select[@id=\"animals\"]"));

        Select select=new Select(element);
        select.selectByVisibleText("Cat");
        Thread.sleep(2000);
        select.selectByValue("big baby cat");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(2000);

       // select.deselectByValue("big baby cat");

       // Thread.sleep(2000);
        driver.quit();
    }
}
