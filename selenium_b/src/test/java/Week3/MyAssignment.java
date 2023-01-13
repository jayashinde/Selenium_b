package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        Thread.sleep(2000);

       String s= driver.getTitle();
        System.out.println(s);

        driver.manage().window().maximize();

        Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mahi");
      Thread.sleep(2000);

      driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("5558998998");
Thread.sleep(2000);

  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sjdsfjsjds@gmail.com");
 Thread.sleep(2000);

 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("554888");
Thread.sleep(2000);

driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("erieriejreijiieir");
Thread.sleep(2000);

driver.findElement(By.xpath("//button[@name='submit']")).click();
Thread.sleep(2000);

 driver.findElement(By.xpath("//input[@id='female']")).click();
 Thread.sleep(2000);

 driver.findElement(By.xpath("//input[@id='monday']")).click();
 Thread.sleep(2000);

 driver.findElement(By.xpath("//input[@id='saturday']")).click();
 Thread.sleep(2000);

 driver.findElement(By.xpath("//select[@class='custom-select']")).click();
 Thread.sleep(2000);
 //driver.findElement(By.xpath(""))




        driver.quit();

    }
}
