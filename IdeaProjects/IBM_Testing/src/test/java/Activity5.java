import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass ( alwaysRun = true)
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test (groups = {"HeaderTests", "ButtonTests"})
    public void CheckCorrectTitle() {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        Assert.assertEquals(title, "Target Practice");

    }

    @Test (dependsOnMethods = {"CheckCorrectTitle"}, groups = {"HeaderTests"})
    public void ThirdHeaderAssertText()
    {
        WebElement thirdhead=driver.findElement(By.id("third-header"));
        Assert.assertEquals(thirdhead.getText(),"Third header");
    }

    @Test (dependsOnMethods = {"CheckCorrectTitle"}, groups = {"HeaderTests"})
    public void FifthHeaderColor()
    {
        WebElement header5 = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
    }

    @Test (dependsOnMethods = {"CheckCorrectTitle"}, groups = {"ButtonTests"})
    public void ButtonTest1() {
        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
        Assert.assertEquals(button1.getText(), "Olive");
    }


    @Test (dependsOnMethods = {"CheckCorrectTitle"}, groups = {"ButtonTests"})
    public void ButtonTest2() {
        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
    }


    @AfterClass (alwaysRun = true)
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}