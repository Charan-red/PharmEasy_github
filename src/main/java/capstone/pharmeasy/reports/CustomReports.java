package capstone.pharmeasy.reports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import capstone.pharmeasy.utils.TestUtility;

public class CustomReports extends Browser{

	
	protected static ExtentReports extent; 
	static ExtentSparkReporter spark;
	static ExtentTest extenttest;

	public static void reportCreation() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("reports/reports.html");
		extent.attachReporter(spark);
	}

public static void finishReportAfterTest(ITestResult itr, WebDriver driver) throws IOException {
		
		extenttest = extent.createTest(itr.getTestClass().getName()+"-"+itr.getMethod().getMethodName());
				
		if(itr.getStatus() == ITestResult.SUCCESS) {
			extenttest.log(Status.PASS, " PharmEasy test succeeded");
			extenttest.log(Status.INFO, "check if this success message is displayed");
		}else if(itr.getStatus() == ITestResult.FAILURE) {
			extenttest.log(Status.FAIL, " PharmEasy test failed");
			extenttest.log(Status.INFO, "check if this failed message is displayed");
			extenttest.addScreenCaptureFromPath(TestUtility.capturescreenshot(driver,itr.getTestClass().getName()+"-"+itr.getMethod().getMethodName()));
		}else if(itr.getStatus() == ITestResult.SKIP) {
			extenttest.log(Status.SKIP, "NCS - one test skipped");
			extenttest.log(Status.INFO, "check if this skipped message is displayed");
		}
		
		
	}
}
