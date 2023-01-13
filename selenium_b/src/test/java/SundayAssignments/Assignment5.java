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

public class Assignment5 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/19875/");

        driver.findElement(By.id("datefield")).sendKeys("27.9.2022");




//
//        String actualText=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2[text()='Good job!']")).getText();
//        String expected="Good job!";
//        Assert.assertEquals(expected,actualText);



            TakesScreenshot ss=(TakesScreenshot) driver;
            File source= ss.getScreenshotAs(OutputType.FILE);
            File folder=new File("src/test/resources/screenshot5.png");
            FileUtils.copyFile(source,folder);


    }




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
