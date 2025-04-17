package WebInputs;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebInputs1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//Get base Url
        driver.get("https://practice.expandtesting.com/inputs");
        driver.manage().window().maximize();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("#btn-display-inputs"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//Get Number
        Thread.sleep(500);
        WebElement numberInput = driver.findElement(By.id("input-number"));
        String randomInt;
        randomInt = String.valueOf((Math.floor(Math.random() * 100) + 1));
        numberInput.sendKeys(randomInt);
        Thread.sleep(500);
        WebElement textInput = driver.findElement(By.id("input-text"));
        textInput.sendKeys("Hello World");
//Get Password
        Thread.sleep(500);
        WebElement passwordInput = driver.findElement(By.cssSelector("#input-password"));
        passwordInput.sendKeys("BestPassword");

// Get a Date
        Thread.sleep(500);
        WebElement dateInput = driver.findElement(By.cssSelector("#input-date"));
        dateInput.sendKeys("05/29/1998");
        // Click on show
        Thread.sleep(500);
        WebElement displayInput = driver.findElement(By.cssSelector("#btn-display-inputs"));
        displayInput.click();
        //Click on Clear
        Thread.sleep(500);
        WebElement clearInput = driver.findElement(By.cssSelector("#btn-clear-inputs"));
        clearInput.click();
        //Close window
        Thread.sleep(500);
        driver.quit();
    }
}