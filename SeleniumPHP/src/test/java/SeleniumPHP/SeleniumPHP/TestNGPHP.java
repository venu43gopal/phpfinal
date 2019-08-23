package SeleniumPHP.SeleniumPHP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNGPHP {
	WebDriver driver;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest Test;
	
  @BeforeClass
  public void launch() {
		
	    htmlReporter = new ExtentHtmlReporter("extendReports.html"); 
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		WebDriverManager.chromedriver().version("2.36").setup();
        driver = new ChromeDriver();
		driver.manage().window().maximize();
  }
  @Test
  public void Test() throws Exception { 
	  Test = extent.createTest("My PHP Test", "PHP Website Testing");
	  
      driver.get("http://34.68.154.135/content/about-us.php");
      
      Test.pass("Navigated to PHP About US Page");
      //driver.findElement(By.xpath("//a[@href='http://34.68.154.135/content/about-us.php']")).click();
      if(driver.getPageSource().contains("Lorem Ipsum Dipsum"))
      {
      	System.out.println("Text Present");
      }
      else
      {
      System.out.println("Text not Present");
      }
      Test.log(Status.INFO,"This step shows usage of log(status, details)");
      Test.info("This step shows usage of info(details)");
      //Test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
      //Test.addScreenCaptureFromPath("screenshot.png");
        
  }
  @AfterClass
  public void afterClass() throws InterruptedException {
	 
	 driver.get("http://34.68.154.135/");
     Thread.sleep(5000);
	 driver.close();
	 extent.flush();
  }
}
