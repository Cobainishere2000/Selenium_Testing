import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxOptions;


import java.util.List;

public class demo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://web.whatsapp.com/");

        driver.findElement(By.xpath("//input[@class='_3sHED']")).sendKeys("Aryan Sharma IBM");
        driver.findElement(By.xpath("//button[@class='opCKJ _28iyj']")).click();



        driver.close();

    }
}