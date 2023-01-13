package TablesCalender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.List;

public class Table {
    WebDriver driver;
    @Test
    public void testCountryName() throws InterruptedException {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        List<WebElement>ErnstHandeElement= driver.findElements(By.xpath("//table[@class=\"ws-table-all\"]/tbody/tr[4]/td"));


        for (WebElement element:ErnstHandeElement) {
            System.out.println(element.getText());
            if (element.getText().equals("Austria")){
                System.out.println("pass");
            }
           // element.get
    }


        //second way
       // System.out.println( ErnstHandeElement.get(2).getText());


//        //Third way
//String actual=ErnstHandeElement.get(2).getText();
//Assert.assertEquals("Austria",actual);
    }


    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }
}