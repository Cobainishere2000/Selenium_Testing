import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.*;
public class Selenium_3 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        String s = driver.getTitle();
        System.out.println(s);


        WebElement usr_fld=driver.findElement(By.id("username"));
        usr_fld.sendKeys("admin");
        WebElement paswd=driver.findElement(By.id("password"));
        paswd.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();


        String ss = driver.getTitle();
        System.out.println(ss);
        driver.quit();
    }
}
