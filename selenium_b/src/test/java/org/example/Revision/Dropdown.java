package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        click();
        tearDown();

    }
    public static void click(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement element =driver.findElement(By.xpath("//td/select[@name='country']"));
        Select select=new Select(element);
        select.selectByVisibleText("INDIA");
        List<WebElement> elements =select.getOptions();
        for (WebElement element1:elements) {
            System.out.println(element1.getText());
        }


    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
