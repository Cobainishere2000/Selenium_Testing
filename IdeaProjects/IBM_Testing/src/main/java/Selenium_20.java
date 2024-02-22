import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Selenium_20 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("prompt")).click();

        // Switch focus to the alert
        Alert promtAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = promtAlert.getText();
        System.out.println("Text in alert: " + alertText);
        // Type into the alert
        promtAlert.sendKeys("Awesome!");


        // Close the alert by clicking OK
        promtAlert.accept();

        // Can also close the alert by clicking Cancel
        // promtAlert.dismiss();

        // Close the browser
        driver.quit();
    }
}

/*
public class Activity20 {
    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.v1.training-support.net/selenium/javascript-alerts");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("prompt")).click();

        // Switch focus to the alert
        Alert promtAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = promtAlert.getText();
        System.out.println("Text in alert: " + alertText);
        // Type into the alert
        promtAlert.sendKeys("Awesome!");

        // Close the alert by clicking OK
        promtAlert.accept();

        // Can also close the alert by clicking Cancel
        // promtAlert.dismiss();

        // Close the browser
        driver.quit();
    }
}

Activity 20
Python Solution:

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("https://www.v1.training-support.net/selenium/javascript-alerts")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the confirm button and click it
    driver.find_element(By.ID, "prompt").click()
    # Switch focus to the alert
    prompt_alert = driver.switch_to.alert
    # Print the text in the alert
    print(prompt_alert.text)
    # Type in the text box
    prompt_alert.send_keys("Python")
    # Close the alert with either one of the methods
    # with OK
    prompt_alert.accept()
    # with Cancel
    # confirm_alert.dismiss()

Handling Multiple Windows/Tabs
Handling Multiple Windows/Tabs
Clicking a link which opens in a new window will focus the new window or tab on screen, but WebDriver will not know which window the operating system considers active.

To work with the new window you will need to switch context to it.
If you have only two tabs or windows open, and you know which window you start with, by the process of elimination you can loop over both windows or tabs that WebDriver can see, and switch to the one which is not the original.
Each Tab/Window that is created by the WebDriver is assigned a unique handle.
First, we use driver.getWindowHandles() to obtain a list containing the handles of all the currently open tabs/windows.
Once we have the list, we iterate through the list until we get the handle of the tab that we require.
Then, we use driver.switchTo().window(<handle>) to switch the driver's focus to that tab.
Activity 21
Multiple Tabs
Using Selenium:

Open a new browser to https://www.v1.training-support.net/selenium/tab-opener
Get the title of the page and print it to the console.
Find the button to open a new tab and click it.
Wait for the new tab to open.
Print all the handles.
Switch to the newly opened tab, print it's title and heading.
Repeat the steps by clicking the button in the new tab page.
Close the browser.

 */