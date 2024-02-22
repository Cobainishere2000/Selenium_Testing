import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Cheese {
    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/search?q=cheese&rlz=1C1GCEU_enIN1090IN1090&oq=cheese&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDIQCAEQLhjHARixAxjRAxiABDIQCAIQLhiDARixAxjJAxiABDINCAMQABiDARixAxiABDIKCAQQABiSAxiABDIKCAUQABixAxiABDIKCAYQABixAxiABDIKCAcQABixAxiABDIKCAgQABixAxiABDIHCAkQABiABNIBCDIzNTBqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");

        WebElement searchText = driver.findElement(By.xpath("//div[@id=\"result-stats\"]"));
        String text[] = searchText.getText().split(" ");

        System.out.println(text[1]);

        driver.close();

    }
}
