package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
  static   WebDriver driver;
    @Before
    public void setup(){

        WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
   public void Test1(){
        Demo1 d1=new Demo1();

    }
    @After
    public  void afterMethod(){
        driver.quit();
    }
}
