import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Taking_screenShots {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();

//        WebDriver driver = new ChromeDriver();


        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setHeadless(true);
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        driver.get("https://www.google.com/search?q=cheese&rlz=1C1GCEU_enIN1090IN1090&oq=cheese&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIQCAEQLhjHARixAxjRAxiABDIQCAIQLhiDARixAxjJAxiABDINCAMQABiDARixAxiABDIKCAQQABiSAxiABDIKCAUQABixAxiABDIKCAYQABixAxiABDIKCAcQABixAxiABDIKCAgQABixAxiABDIHCAkQABiABNIBCDIzNTBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");

        WebElement searchText = driver.findElement(By.xpath("//div[@id=\"result-stats\"]"));
        String num[] = searchText.getText().split(" ");

        String fileName = System.currentTimeMillis() + "Test";
        File screenshot = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        File outputFile = new File("LoggerScreenshots/" + fileName + ".png");
        System.out.println(outputFile.getAbsolutePath());
        try {
            FileUtils.copyFile(screenshot, outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(num[1]);


        WebElement third_link = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[7]/div/div/div[1]/div/div/span/a/h3"));
        System.out.println(third_link.getText());


        driver.close();

    }
}
