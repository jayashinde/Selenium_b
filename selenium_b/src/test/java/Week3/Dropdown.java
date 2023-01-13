package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement country=driver.findElement(By.name("country"));
        Select select=new Select(country);

        //byvisible
        select.selectByVisibleText("INDIA");
        Thread.sleep(2000);
        //Byvalue
        select.selectByValue("INDIA");
        Thread.sleep(2000);
        //ByIndex

        select.selectByIndex(107);
        Thread.sleep(2000);

        List<WebElement> list = select.getOptions();
        for (WebElement select1:list) {
            System.out.println(select1.getText());
        }



        Thread.sleep(2000);
        driver.quit();






    }




}
