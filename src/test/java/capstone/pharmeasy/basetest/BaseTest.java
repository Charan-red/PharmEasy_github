
package capstone.pharmeasy.basetest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import capstone.pharmeasy.reports.*;
//extends CustomReports
public class BaseTest  {
	public static WebDriver driver;

//	@BeforeTest
//	public void beforeTest() throws Exception {
//		CustomReports.reportCreation();
//
//	}

//	@AfterMethod
//	public void afterMethod(ITestResult itr) throws Exception {
//
////		if (!itr.isSuccess()) {
////			TestUtility.capturescreenshot();
////		}
//		CustomReports.finishReportAfterTest(itr, null);
//	}

//	@AfterTest
//	public void afterTest() {
//		extent.flush();
//	}


}
