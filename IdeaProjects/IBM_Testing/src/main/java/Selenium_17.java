import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Selenium_17 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://v1.training-support.net/selenium/selects");

        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
//        WebElement aboutUsButton = driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));

        WebElement dropdown= driver.findElement(By.xpath("//*[@id=\"single-select\"]"));
        Select list = new Select(dropdown);
        list.selectByVisibleText("Option 2");
        list.selectByIndex(2);
        list.selectByValue("4");
        List<WebElement> options=list.getOptions();
        for (WebElement option : list.getOptions()) {
            System.out.println(option.getText());
        }
        driver.close();
    }
}