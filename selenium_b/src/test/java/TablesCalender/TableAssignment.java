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

public class TableAssignment {
    WebDriver driver;
    @Test
    public void testCountryName() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");

        List<WebElement> kierraCells = driver.findElements(By.xpath("//div[@class='rt-tr-group'][3]/div/div"));
        String actualSalary = kierraCells.get(4).getText();
        Assert.assertEquals("2000", actualSalary);

        for (WebElement element: kierraCells) {
            System.out.println(element.getText());
            if (element.getText().equals("2000")){
                System.out.println("Pass");
            }
        }




        //second way
       // System.out.println( ErnstHandeElement.get(2).getText());


        //Third way
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