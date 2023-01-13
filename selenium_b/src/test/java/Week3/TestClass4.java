package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestClass4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");

      // WebElement element= driver.findElement(By.xpath(""));

        driver.findElement(By.cssSelector("a[class='nav-link']")).click();
          Thread.sleep(2000);
         String title= driver.getTitle();
        System.out.println(title);
        String url= driver.getCurrentUrl();
        System.out.println(url);

        driver.findElement(By.cssSelector("input#first-name")).sendKeys("Jaya");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#last-name")).sendKeys("Shind");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#job-title")).sendKeys("java developer");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#radio-button-2")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#checkbox-2")).click();
        Thread.sleep(2000);

       WebElement element= driver.findElement(By.cssSelector("select#select-menu"));
       Select select=new Select(element);
       select.selectByVisibleText("Select an option");
       Thread.sleep(2000);
       select.selectByValue("1");
       Thread.sleep(2000);
       select.selectByIndex(2);
       Thread.sleep(2000);


       driver.findElement(By.cssSelector("input#datepicker")).sendKeys("14/sep/22");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@href='/thanks']")).click();

        driver.quit();





    }
}
