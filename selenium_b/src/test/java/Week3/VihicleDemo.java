package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VihicleDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.findElement(By.id("nav_automobile")).click();
        Thread.sleep(2000);
       WebElement element = driver.findElement(By.id("make"));
        Select select=new Select(element);
        select.selectByVisibleText("Audi");
        Thread.sleep(2000);

        driver.findElement(By.id("engineperformance")).sendKeys("200");
        Thread.sleep(2000);

        driver.findElement(By.id("dateofmanufacture")).sendKeys("2/2/2022");
        Thread.sleep(2000);

     WebElement element1=   driver.findElement(By.id("numberofseats"));
        Select select1=new Select(element1);
        select1.selectByValue("1");
        Thread.sleep(2000);

       WebElement element2= driver.findElement(By.id("fuel"));
        Select select2=new Select(element2);
        select2.selectByIndex(2);
        Thread.sleep(2000);

        driver.findElement(By.id("listprice")).sendKeys("600");
        Thread.sleep(2000);

        driver.findElement(By.id("licenseplatenumber")).sendKeys("500");
        Thread.sleep(2000);

        driver.findElement(By.id("annualmileage")).sendKeys("100");
        Thread.sleep(2000);

        driver.findElement(By.id("nextenterinsurantdata")).click();
        System.out.println("*************************************");

        driver.findElement(By.id("enterinsurantdata")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("firstname")).sendKeys("Mahi");
        Thread.sleep(2000);



        driver.findElement(By.id("lastname")).sendKeys("Patil");
        Thread.sleep(2000);

        driver.findElement(By.id("birthdate")).sendKeys("29/4/2000");
        Thread.sleep(2000);

        driver.findElement(By.id("genderfemale")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("firstname")).sendKeys("Mahi");
        Thread.sleep(2000);
        driver.findElement(By.id("streetaddress")).sendKeys("Latur");
        Thread.sleep(2000);

        WebElement element3 =driver.findElement(By.id("country"));

        Select select3=new Select(element3);
        select3.selectByValue("Andorra");
        Thread.sleep(2000);

        driver.findElement(By.id("zipcode")).sendKeys("5488");
        Thread.sleep(2000);

        driver.findElement(By.id("city")).sendKeys("Latur");
        Thread.sleep(2000);

      WebElement element4=  driver.findElement(By.id("occupation"));
      Select select4=new Select(element4);
      select4.selectByValue("Employee");
        Thread.sleep(2000);

        driver.findElement(By.id("speeding")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("website")).sendKeys("Vehicle.com");
        Thread.sleep(2000);
//pic
        driver.findElement(By.id("picture")).sendKeys("Vehiclepic");
        Thread.sleep(2000);

        driver.findElement(By.id("nextenterproductdata")).click();
        Thread.sleep(2000);




    }
}
