package TablesCalender;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableDemo3 {
    WebDriver driver;
    @Test
    public void testCountryName() throws InterruptedException {
        driver.get("https://www.w3schools.com/html/html_tables.asp");
        List<WebElement>company= driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr/td[1]"));

boolean parent=false;
        for (WebElement element:company) {
            System.out.println(element.getText());
            if (element.getText().equals("Island Trading")){
                parent=true;
            }
            }
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