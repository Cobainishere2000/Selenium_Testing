import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
    // Declare the WebDriver object
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        // Set up the Firefox driver
        WebDriverManager.firefoxdriver().setup();
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void FirstTest()
    {
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals( title,"Target Practice");
    }

    @Test
    public void SecondTest()
    {
        WebElement blk_but= driver.findElement(By.xpath("//button[@class=\"ui black button\"]"));
        Assert.assertFalse(blk_but.isDisplayed());

    }

    @Test(enabled = false)
    public void ThirdTest()
    {
        System.out.println("This is skipped ");
    }

    @Test
    public void FourthTest()throws SkipException
    {
        String s="Saptarshi";
        if (s.equals("Saptarshi")){
            throw new SkipException("Skiiping Fourth");
        }
        else {

        }
    }
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }

}