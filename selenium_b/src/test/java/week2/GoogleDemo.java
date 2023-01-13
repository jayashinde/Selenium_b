package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleDemo {
    //variable
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
       setup();
       login();
       tearnDown();
    }
    private static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    private static void login() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
      //  driver.findElement(By.linkText("About")).click();
        driver.findElement(By.xpath("//a[@class='pHiOh']")).click();
       String title= driver.getTitle();
       Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.xpath("//a[@href='https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1']")).click();
        Thread.sleep(2000);

     //   driver.findElement(By.xpath("//input[@class='gLFyf gsfih']")).sendKeys("Javatpoint");
 //  Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.name("q")).sendKeys("java ");
        Thread.sleep(2000);

   driver.quit();
    }
    private static void tearnDown() throws InterruptedException{

        driver.quit();
    }


}
