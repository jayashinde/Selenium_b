package org.example.Week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.google.com/search?q=firefox&rlz=1C1CHBD_enIN1017IN1017&oq=fir&aqs=chrome.1.69i57j0i433i512j46i131i199i433i465i512j0i131i433i512j0i512j0i131i433i512l3j0i433i512j46i131i199i433i465i512.2619j0j7&sourceid=chrome&ie=UTF-8");
//
         WebDriverManager.firefoxdriver().setup();
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.youtube.com/");
         driver.get("https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Den%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=en&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
         driver.findElement(By.name("username")).sendKeys("shijayashri9@gmail.com");
        // driver.findElement(By.name("")).click();


//         driver.findElement(By.name("email")).sendKeys("shijayashri9@gmail.com");
//         driver.findElement(By.name("pass")).sendKeys("K7758900181");
//         driver.findElement(By.name("login")).click();




//         driver.get("https://www.facebook.com/");
//         driver.findElement(By.name("email")).sendKeys("nbvhgcfg@hhdbjaj.com");
//         Thread.sleep(5000);
//         driver.close();

}
}
