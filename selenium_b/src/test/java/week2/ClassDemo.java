package week2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassDemo {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        setup(); // launch and maximixe chrome browser
        login(); // login steps
        tearDown(); // close the browser
    }
    private static void login() throws InterruptedException {
        driver.get("https://www.google.com/");
// driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.partialLinkText("og i")).click();
        driver.findElement(By.name("Email")).sendKeys("testemail128@test.com");
        driver.findElement(By.className("password")).sendKeys("test123");
        driver.findElement(By.cssSelector(".button-1.login-button")).click();
        Thread.sleep(3000);
    }
    private static void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(1000);
    }

    private static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
}}
