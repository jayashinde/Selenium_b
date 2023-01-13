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

public class Assignment13 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/78264/");

  String no1=driver.findElement(By.id("no1")).getText();
        System.out.println(no1);

        String no2=driver.findElement(By.id("no2")).getText();
        System.out.println(no2);

    }




    @After
    public void tearDown() throws InterruptedException {
       // Thread.sleep(2000);
        driver.quit();

    }


}
