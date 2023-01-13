package SundayAssignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

public class Assignment4 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {

     driver.get("https://obstaclecourse.tricentis.com/Obstacles/51130/");
   String parent=  driver.getWindowHandle();

     driver.findElement(By.xpath("//p/a[text()='Click Me']")).click();
     Thread.sleep(3000);

    Set<String> hanles= driver.getWindowHandles();
        for (String str:hanles) {


            if (!parent.equals(hanles)) {
               driver.switchTo().window(str);
                System.out.println(driver.getCurrentUrl());
                driver.close();
            }


        }

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
