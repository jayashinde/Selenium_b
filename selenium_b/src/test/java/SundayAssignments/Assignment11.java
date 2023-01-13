package SundayAssignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Assignment11 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/94441/");

   WebElement element= driver.findElement(By.cssSelector(".form-control#multiselect"));

        Select select=new Select(element);
        select.selectByVisibleText("Functional testing");
        select.selectByVisibleText("Unit testing");
        select.selectByVisibleText("GUI testing");
        select.selectByVisibleText("End2End testing");
        select.selectByVisibleText("Exploratory testing");

        List<WebElement> options=select.getOptions();
        for (WebElement option:options) {
            System.out.println(option.getText());
        }

    }




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
