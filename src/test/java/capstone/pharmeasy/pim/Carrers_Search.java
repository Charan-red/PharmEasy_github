package capstone.pharmeasy.pim;

import org.testng.annotations.Test;

import capstone.pharmeasy.basetest.*;
import capstone.pharmeasy.pim.*;
import capstone.pharmeasy.po.*;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;


public class Carrers_Search extends Browser {
	
	  @Test(priority = 1)
	  public void SearchResultsValidInputs() throws Exception {
		  String parentWindowHandle = driver.getWindowHandle();
			CareersPO objpharmeasy = new CareersPO(driver);
			objpharmeasy.scroll();
			objpharmeasy.click_close_login();
			objpharmeasy.click_careers();
			objpharmeasy.click_startapply_btn();
			objpharmeasy.navigate_tab(parentWindowHandle);
			Thread.sleep(2000);
//			WebElement element = driver.findElement(By.xpath("//*[@id=\"jobTitle\"]"));
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
//			wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
			objpharmeasy.jobtitle_name("Assistant Manager");
			Thread.sleep(2000);
			objpharmeasy.select_dep();
//			objpharmeasy.experence();
			objpharmeasy.employee_type();
			Thread.sleep(2000);
			objpharmeasy.click_search_btn();
			Thread.sleep(2000);
			WebElement validate = driver.findElement(By.xpath("/html/body/app-root/div/app-user-views/div[2]/app-jobs-wrapper/app-jobs/div/div[3]/div/div[3]/app-jobs-list/app-custom-table/table/tbody/tr/td[1]/a"));
			String data = validate.getText();
			assertTrue(data.contains("Assistant"));
//			objpharmeasy.validate_data();
			Thread.sleep(2000);
			objpharmeasy.switch_parent(parentWindowHandle);
			Thread.sleep(2000);
		  
	  }
	  
	  @Test(priority = 2)
	  public void SearchResultsBlankInputs() throws Exception {
		  String parentWindowHandle = driver.getWindowHandle();
		    CareersPO objpharmeasy = new CareersPO(driver);
//			objpharmeasy.scroll();
//			objpharmeasy.click_close_login();
//			objpharmeasy.click_careers();
			objpharmeasy.click_startapply_btn();
			objpharmeasy.navigate_tab(parentWindowHandle);
			Thread.sleep(2000);
			objpharmeasy.jobtitle_name_1();
//			Thread.sleep(3000);
//			objpharmeasy.select_dep();
////			objpharmeasy.experence();
//			objpharmeasy.employee_type();
			Thread.sleep(10000);
			objpharmeasy.click_search_btn();
			Thread.sleep(10000);
		  
	  }
//	  @BeforeClass
//		public void beforeClass() throws Exception {
//			driver = new ChromeDriver();
//			driver.get("https://pharmeasy.in/");
//
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
//			driver.manage().window().maximize();
//			Thread.sleep(5000);
//			String parentWindowHandle = driver.getWindowHandle();
//			
//		}
//
//		@AfterClass
//		public void afterClass() {
//			driver.quit();
//		}
//	  
//	  
	 
	  
	  
	}
