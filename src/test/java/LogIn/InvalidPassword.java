package LogIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class InvalidPassword {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//Get base Url
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector(".col-md-5.m-auto.my-3.rounded"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//Get valid Username
        Thread.sleep(1000);
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("practice");
//Get Valid Password
        Thread.sleep(1000);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Wrong123!");
//Click Log in
        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();

// Close window
        Thread.sleep(2000);
        driver.quit();
    }
}