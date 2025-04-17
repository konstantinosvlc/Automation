package LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class ValidLogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//Get base Url
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector(".col-md-5.m-auto.my-3.rounded"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//Get valid Username
        Thread.sleep(500);
        driver.findElement(By.id("username")).sendKeys("practice");
//Get Valid Password
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//Click Log in
        Thread.sleep(500);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
// Close window
        Thread.sleep(500);
        driver.quit();
    }
}