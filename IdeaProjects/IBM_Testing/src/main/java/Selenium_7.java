import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Selenium_7 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Create the Actions object
        Actions builder = new Actions(driver);
        // Open the page
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        WebElement drop1=driver.findElement(By.id("droppable"));
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop2=driver.findElement(By.id("dropzone2"));
        builder.dragAndDrop(ball,drop1).build().perform();


        builder.clickAndHold(ball).moveToElement(drop1).pause(2000).release().build().perform();

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(ball, drop2).build().perform();

        driver.close();
    }
}
