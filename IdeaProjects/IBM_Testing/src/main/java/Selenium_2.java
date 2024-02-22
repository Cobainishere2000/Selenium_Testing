import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.lang.*;
public class Selenium_2 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");
        String s = driver.getTitle();
        System.out.println(s);

        String but="about-link";
        WebElement l=driver.findElement(By.id(but));
        l.click();
        String ss=driver.getTitle();
        System.out.println(ss);
        driver.quit();
    }
}
