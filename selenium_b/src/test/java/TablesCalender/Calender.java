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

public class Calender {

    WebDriver driver;
    @Test
    public void testCountryName() throws InterruptedException {

            driver.get("https://elm-datepicker.herokuapp.com/#Simple");
            driver.findElement(By.linkText("Simple DatePicker")).click();

       driver.findElement(By.cssSelector("#next-month")).click();

//        while (s < "Nov 2022") {
//            text += "The number is " + i;
//            i++;
//        }


            List<WebElement> dates = driver.findElements(By.xpath("//div[@class='pa3 dib gray']/table//td"));
            for (WebElement element : dates) {
                if (element.getText().equals("18")) {
                    element.click();
                    break;
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
