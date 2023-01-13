package LogicalProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo3 {


        static WebDriver driver;
        @Test
        public void validLogin() throws InterruptedException {
            driver.get("https://demo.guru99.com/test/newtours/");

            driver.findElement(By.xpath("//a[@href='login.php']")).click();
            driver.findElement(By.name("userName")).sendKeys("Jay@gmail.com");
            Thread.sleep(2000);
            driver.findElement(By.name("password")).sendKeys("12345");
            Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='submit']")).click();

          String actual=  driver.findElement(By.xpath("//table[@width='492']")).getText();
         String expected="Login Successfully";
       Assert.assertEquals(expected,actual);
//Assert.assertEquals("Error message is displayed ",expected,actual);
        }


    @Test


        @After
        public  void tearDown() throws InterruptedException {
            driver.quit();
            Thread.sleep(2000);

        }


        @Before
        public void setup(){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }
    }











