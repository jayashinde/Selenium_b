package Week3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShort {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        TakesScreenshot tc=(TakesScreenshot)driver;
        File tcScreenshotAs =tc.getScreenshotAs(OutputType.FILE);
        File target=new File("\\resources\\demo.png");
        FileUtils.copyFile(tcScreenshotAs,target);

        driver.quit();
    }
}
