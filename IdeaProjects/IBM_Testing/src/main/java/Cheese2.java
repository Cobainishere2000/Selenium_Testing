import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Cheese2 {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search?q=cheese&rlz=1C1GCEU_enIN1090IN1090&oq=cheese&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIQCAEQLhjHARixAxjRAxiABDIQCAIQLhiDARixAxjJAxiABDINCAMQABiDARixAxiABDIKCAQQABiSAxiABDIKCAUQABixAxiABDIKCAYQABixAxiABDIKCAcQABixAxiABDIKCAgQABixAxiABDIHCAkQABiABNIBCDIzNTBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");

        WebElement searchText = driver.findElement(By.xpath("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[7]/div/div/div[1]/div/div/span/a/h3"));
        String text = searchText.getText();

        System.out.println(text);

        driver.close();

    }
}
