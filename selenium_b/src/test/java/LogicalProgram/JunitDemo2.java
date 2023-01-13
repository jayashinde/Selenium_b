package LogicalProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemo2 {

    public WebDriver driver;

    @Test
    public void testInvalidUsername() {
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Jaya");
        driver.findElement(By.id("LastName")).sendKeys("shinde");
        driver.findElement(By.id("Email")).sendKeys("Test@1232gmail.com");
        driver.findElement(By.id("Password")).sendKeys("12345");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("12345");
        driver.findElement(By.id("register-button")).click();
    }

    @Test
    public void testInvalidPassword() {
        driver.get("https://demowebshop.tricentis.com/register");
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("");
        driver.findElement(By.id("LastName")).sendKeys("");
        driver.findElement(By.id("Email")).sendKeys("Test@123");
        driver.findElement(By.id("Password")).sendKeys("");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("");
        driver.findElement(By.id("register-button")).click();

    }


    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

}
