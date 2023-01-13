package LogicalProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class AutoSezationDemo2 {
   static WebDriver driver;
   @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void atuoDemo() throws InterruptedException, IOException {
        driver.get("https://www.google.com/");
        driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("junit framework");
                driver.findElement(By.xpath("//div[@class='wM6W7d']/span/b[text()=' in selenium']")).click();
        File screenshot = ((TakesScreenshot)
                driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("src/test/resources/ screenshot.png"));
                //Date date = new Date("");
    }





    @After
    public void tearDown() throws InterruptedException {
       Thread.sleep(2000);
       driver.quit();

    }






}
