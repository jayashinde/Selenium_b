//package Week3;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Assignment1 {
//    public static void main(String[] args) throws InterruptedException {
//
//                WebDriverManager.chromedriver().setup();
//                WebDriver driver=new ChromeDriver();
//
//                driver.get("https://demoqa.com/links");
//
//           driver.findElement(By.cssSelector("#created")).click();
//                boolean value=driver.findElement(By.cssSelector("#created")).isEnabled();
//                 System.out.println(value);
//
//
//                driver.findElement(By.cssSelector("#no-content")).click();
//                Thread.sleep(2000);
//        boolean value2=driver.findElement(By.cssSelector("#no-content")).isEnabled();
//        System.out.println(value2);
//
//
//        driver.findElement(By.cssSelector("#moved")).click();
//                Thread.sleep(2000);
//        boolean value3=driver.findElement(By.cssSelector("#moved")).isEnabled();
//        System.out.println(value3);
//
//                driver.findElement(By.cssSelector("#bad-request")).click();
//                Thread.sleep(2000);
//        boolean value4=driver.findElement(By.cssSelector("#bad-request")).isEnabled();
//        System.out.println(value4);
//
//                driver.findElement(By.cssSelector("#unauthorized")).click();
//                Thread.sleep(2000);
//              boolean value5=driver.findElement(By.cssSelector("#bad-request")).isEnabled();
//               System.out.println(value5);
//
//
//        driver.findElement(By.cssSelector("#forbidden")).click();
//                Thread.sleep(2000);
//        boolean value6=driver.findElement(By.cssSelector("#bad-request")).isEnabled();
//        System.out.println(value6);
//
//
//        driver.findElement(By.cssSelector("#invalid-url")).click();
//                Thread.sleep(2000);
//        boolean value7=driver.findElement(By.cssSelector("#bad-request")).isEnabled();
//        System.out.println(value7);
//
//
//
//        driver.quit();
//
//
//            }
//        }
