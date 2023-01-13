package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo1 {
    public static void main(String[] args) throws InterruptedException {
        {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/droppable/");

           WebElement source =driver.findElement(By.id("droppable"));
            WebElement target =driver.findElement(By.id("draggable"));
            Actions action=new Actions(driver);
            Thread.sleep(5000);
            action.dragAndDrop(source,target).perform();


        }
    }}
