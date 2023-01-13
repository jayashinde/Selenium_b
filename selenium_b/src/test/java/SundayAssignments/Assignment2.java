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

public class Assignment2 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/12952/");
        driver.findElement(By.xpath("//div[@id='thisoneistheright']/p[@class='text-center']")).click();
        Thread.sleep(2000);

        String expected="Good job!";
        String actualText=driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2[text()='Good job!']")).getText();
        Assert.assertEquals(expected,actualText);


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/resources/screenshot2.png"));





    }




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
