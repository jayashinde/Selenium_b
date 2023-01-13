//package Week4;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class ActionDemo1 {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();
//
//        WebElement email = driver.findElement(By.id("Email"));
//
//        Actions actions = new Actions(driver);
//        actions.sendKeys(email, "test").perform();
//        Thread.sleep(2000);
//
//        actions.sendKeys(Keys.BACK_SPACE)
//                .sendKeys(Keys.BACK_SPACE)
//                .sendKeys(Keys.BACK_SPACE)
//                .sendKeys(Keys.BACK_SPACE)
//                .perform();
//        WebElement password = driver.findElement(By.id("password"));
//        actions.sendKeys(password, "255563").perform();
//       Th
//    }
//}
