package LogicalProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertDemo {
    static WebDriver driver;
    @After
    public void beforeD(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testD() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/");

        driver.findElement(By.xpath("//a[@href='login.php']")).click();
        driver.findElement(By.name("userName")).sendKeys("Jay@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        String actual=  driver.findElement(By.xpath("//table[@width='492']")).getText();
        String expected="Login Successfully";

        Assert.assertEquals("Expected and actual did not match","expected","actual");
    }


   @After
    public void afterD(){
        driver.quit();
    }



}
