package org.example.Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebNavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        //chrome broswer minimize
//        driver.manage().window().minimize();
//        Thread.sleep(3000);
//        //open facebook page
//        driver.get("https://www.facebook.com/login/");
//     String title= driver.getTitle();
//        System.out.println(title);
//     String url=   driver.getCurrentUrl();
//        System.out.println(url);
//
//

        //driver.quit();
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();



    }}