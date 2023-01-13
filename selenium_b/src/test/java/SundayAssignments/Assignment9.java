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

public class Assignment9 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/72954/retry");

        driver.findElement(By.cssSelector("#rnd_46576.btn.theme-btn-color.btn-lg.animated.fadeInDown.delay-1.btn-big")).click();
        // Thread.sleep(2000);

        driver.findElement(By.xpath("//p[@class='text-center']/a[text()='Click me once more']")).click();


            TakesScreenshot ss=(TakesScreenshot) driver;
            File source= ss.getScreenshotAs(OutputType.FILE);
            File folder=new File("src/test/resources/screenshot9.png");
            FileUtils.copyFile(source,folder);
        }


    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }


}
