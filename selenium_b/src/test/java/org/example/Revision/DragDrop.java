package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DragDrop {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup();
        click();
        tearDown();

    }
    public static void click(){

        driver.get("https://demoqa.com/droppable/");
      WebElement source=  driver.findElement(By.id("draggable"));
      WebElement target= driver.findElement(By.id("droppable"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();


    }
    public static void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
