package SeleniumPHP.SeleniumPHP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
        WebDriverManager.chromedriver().version("2.36").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://34.68.154.135/");
        driver.close();
        driver.quit();
	}

}
