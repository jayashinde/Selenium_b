package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ClassDemo1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
     //   driver.get("https://demowebshop.tricentis.com/register");




            driver.get("https://demoqa.com/browser-windows");
            driver.findElement(By.id("windowButton")).click();
            Thread.sleep(2000);

            Set<String> handles = driver.getWindowHandles();

            for (String windowName : handles) {
                driver.switchTo().window(windowName);
                String title = driver.getTitle();
                if (title.equals("Browser Windows")) {     //ToolsQA
//                System.out.println(driver.findElement(By.id("sampleHeading")).getText());
                    System.out.println(driver.getTitle());
                    System.out.println(driver.getTitle() + " test title ");
                }
            }
        }
    }

