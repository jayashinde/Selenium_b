package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Guru99Assignment1 {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        setup();


        operation();

        dearDown();

    }

    private static void dearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    private static void operation() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[href=\"register.php\"]")).click();
        driver.findElement(By.cssSelector("input[name=\"firstName\"]")).sendKeys("Mahi");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"lastName\"]")).sendKeys("shinde");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("8896565875");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"userName\"]")).sendKeys("test@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"address1\"]")).sendKeys("Latur");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("nilanga");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"state\"]")).sendKeys("Maharashtra");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"postalCode\"]")).sendKeys("413521");
        Thread.sleep(2000);
       //
        WebElement country=driver.findElement(By.name("country"));
        Select select=new Select(country);

        //byvisible
        select.selectByVisibleText("INDIA");
        Thread.sleep(2000);
        //Byvalue
       select.selectByValue("INDIA");
       Thread.sleep(2000);
        //ByIndex
    select.selectByIndex(107);
       Thread.sleep(2000);

       List<WebElement> list = select.getOptions();
        for (WebElement select1:list) {
            System.out.println(select1.getText());
        }
   driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("Jaya");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("555555");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"confirmPassword\"]")).sendKeys("555555");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();


    }

    private static void setup() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
}
