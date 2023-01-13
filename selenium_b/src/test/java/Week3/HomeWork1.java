package Week3;
//Switch to frame, get heading text.
//        Switch back to default page, click on logo and validate url is “https://demoqa.com/
//        “
//        Hint: use this to switch bak to original page => driver.switchTo().defaultContent();
//


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/");
        



        driver.quit();
    }
}
