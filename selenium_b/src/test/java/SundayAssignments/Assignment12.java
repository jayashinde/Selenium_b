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

public class Assignment12 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/73588/");
        driver.findElement(By.id("clickme")).click();
        Thread.sleep(10000);


        String randomvalue = driver.findElement(By.id("randomtext")).getAttribute("value");
        Thread.sleep(5000);
        System.out.println(randomvalue);
     WebElement element=  driver.findElement(By.id("selectlink"));
     Select text=new Select(element);
     List<WebElement>list=text.getOptions();
        for (WebElement element1:list) {
            text.selectByVisibleText(randomvalue);
        }
        Thread.sleep(2000);
        driver.findElement(By.id("submitanswer")).click();

    }




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.quit();

    }


}
