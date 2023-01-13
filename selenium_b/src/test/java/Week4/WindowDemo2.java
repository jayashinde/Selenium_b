package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowDemo2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

            driver.get("https://demoqa.com/browser-windows");
            String parent = driver.getWindowHandle();

            driver.findElement(By.id("windowButton")).click();
            Thread.sleep(2000);

            Set<String> handles = driver.getWindowHandles();
            Iterator<String> handlesIterator = handles.iterator();
            Thread.sleep(2000);

            while (handlesIterator.hasNext()) {
                if (handlesIterator.next() != parent) {
                    driver.switchTo().window(handlesIterator.next());
                    driver.manage().window().maximize();
                    Thread.sleep(3000);
                    System.out.println(driver.findElement(By.id("sampleHeading")).getText());
                    driver.close();     //close the current window that selenium is controlling
                }
            }


driver.quit();

    }
}
