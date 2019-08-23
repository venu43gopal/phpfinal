package SeleniumPHP.SeleniumPHP;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extendRreports.html"); 
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		
	}

}
