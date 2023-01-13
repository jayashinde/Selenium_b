package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo2 {

        static WebDriver driver;
        @Before
        public void setup(){

            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
            driver.manage().window().maximize();
        }
        @Test
        public void Test1() throws InterruptedException {
           driver.get("https://demowebshop.tricentis.com/login");
          WebElement  element=driver.findElement(By.cssSelector("#Email"));
            Actions act=new Actions(driver);
            act.sendKeys("Jaya").perform();
            Thread.sleep(2000);
            act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).sendKeys("KKK").perform();


            Thread.sleep(2000);
            act.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
        }
        @After
        public  void afterMethod(){
        driver.quit();
        }
    }
