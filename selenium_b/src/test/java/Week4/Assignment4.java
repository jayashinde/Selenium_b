package Week4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {


      WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");

     WebElement element= driver.findElement(By.className("tox-edit-area__iframe"));
        driver.switchTo().frame(element);
        System.out.println(driver.findElement(By.className("mce-content-body ")).getText());

}
}