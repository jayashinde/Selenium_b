package SundayAssignments;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Assignment8 {
    static WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testTest() throws InterruptedException, IOException {
        driver.get("https://obstaclecourse.tricentis.com/Obstacles/73590/");

        driver.findElement(By.id("pass")).sendKeys("ABC");

 String s="ABC";
  String str=   driver.findElement(By.xpath("//div[@class='col-md-4']/p/a[text()=' Click Me']")).getText();

        System.out.println(str);

  Thread.sleep(2000);

   Alert alert= driver.switchTo().alert();
    alert.accept();

  }









    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
     //   driver.quit();

    }


}
