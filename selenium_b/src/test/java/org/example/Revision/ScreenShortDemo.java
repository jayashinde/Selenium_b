package org.example.Revision;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShortDemo {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demowebshop.tricentis.com/");

        TakesScreenshot ss=(TakesScreenshot) driver;
        File source= ss.getScreenshotAs(OutputType.FILE);
        File folder=new File("src/test/resources/screenshot11.png");
        FileUtils.copyFile(source,folder);
    }
}
