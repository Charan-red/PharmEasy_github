package capstone.pharmeasy.pim;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capstone.pharmeasy.base.BaseClass;
import capstone.pharmeasy.reports.CustomReports;



public class Browser extends CustomReports{
  
	
	WebDriver driver;
	//public static String URL="https://pharmeasy.in/";
	
  @BeforeClass
  public void beforeClass() {
	  driver = BaseClass.initializeDriver();
	  String parentWindowHandle = driver.getWindowHandle();
  }
  
  @AfterMethod
	public void afterMethod(ITestResult itr) throws IOException, InterruptedException {
		Thread.sleep(3000);
//			if(!itr.isSuccess()) {
//			
//			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			
//			String path = System.getProperty("user.dir")+"/screenshots/"+itr.getMethod().getMethodName()+"/screenshot.png";
//			File imagefile = new File(path);
//			
//			FileUtils.copyFile(source, imagefile);	
//		}
//			
//			 else {
//	                File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	                
//	                String path = System.getProperty("user.dir")+"/failed-screenshots/"+itr.getMethod().getMethodName()+"/screenshot.png";
//	                File imagefile = new File(path);
//	                
//	                FileUtils.copyFile(source, imagefile);  
//	            }
		CustomReports.finishReportAfterTest(itr, null);

	}

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  @BeforeTest
	public void beforeTest() throws Exception {
		CustomReports.reportCreation();

	}

//	@AfterMethod
//	public void afterMethod(ITestResult itr) throws Exception {
//
////		if (!itr.isSuccess()) {
////			TestUtility.capturescreenshot();
////		}
//		CustomReports.finishReportAfterTest(itr, null);
//	}

	@AfterTest
	public void afterTest() {
		extent.flush();
	}

}
