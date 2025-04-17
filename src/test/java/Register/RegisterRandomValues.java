package Register;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.security.SecureRandom;

public class RegisterRandomValues {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//Get base Url
        driver.get("https://practice.expandtesting.com/register");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector(".col-md-5.m-auto.my-3.rounded"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        //username , password generator
        String username = generateUsername();
        String password = generatePassword(12);

        Thread.sleep(500);
        driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(By.id("confirmPassword")).sendKeys(password);
        Thread.sleep(500);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(500);
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        WebElement element1 = driver.findElement(By.cssSelector(".col-md-5.m-auto.my-3.rounded"));
        js1.executeScript("arguments[0].scrollIntoView(true);", element1);
        driver.findElement(By.id("username")).sendKeys(username);
        Thread.sleep(500);
        driver.findElement(By.id("password")).sendKeys(password);
        Thread.sleep(500);
        WebElement element2 = driver.findElement(By.cssSelector("button[type='submit']"));
        js1.executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(200);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    public static String generateUsername() {
        long timestamp = System.currentTimeMillis();
        return "user" + timestamp;
    }

    public static String generatePassword(int length) {
        if (length < 4) {
            length = 4; // enforce minimum length
        }

        String charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(charset.length());
            password.append(charset.charAt(randomIndex));
        }

        return password.toString();

    }
}