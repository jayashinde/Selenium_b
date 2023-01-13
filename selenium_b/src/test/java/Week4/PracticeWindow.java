package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class PracticeWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
// gert the url for parent window
            driver.get("https://demoqa.com/browser-windows");
            //handle parent window
          String parent=  driver.getWindowHandle();

          //click on parent window element
            driver.findElement(By.id("windowButton")).click();
              Thread.sleep(3000);
          //handle the multiple child windows in parent window
             Set<String> handles= driver.getWindowHandles();
             //iterate that window one by one
            Iterator handlesIterator= handles.iterator();
              //check the condition
            while (handlesIterator.hasNext()){

                if (handlesIterator.next()!=parent){
                    driver.switchTo().window((String) handlesIterator.next());
                   // System.out.println();
                    Thread.sleep(3000);
                    System.out.println(driver.findElement(By.id("sampleHeading")).getText());


                }
            }

  //    driver.quit();

    }
}
