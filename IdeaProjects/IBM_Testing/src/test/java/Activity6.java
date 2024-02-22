import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    @Parameters ({"sUsername" , "sPassword"})
    public void CheckCorrectLoginMessageTest(String sUsername, String sPassword)
    {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        WebElement usrnme=driver.findElement(By.id("username"));
        usrnme.sendKeys(sUsername);

        WebElement paswd=driver.findElement(By.id("password"));
        paswd.sendKeys(sPassword);

        driver.findElement(By.xpath("//button[@class='ui button']")).click();

        WebElement conf_msg= driver.findElement(By.id("action-confirmation"));
        Assert.assertEquals("Welcome Back, admin" , conf_msg.getText());

    }


    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}