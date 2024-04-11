package capstone.pharmeasy.pim;

import org.testng.annotations.Test;

import capstone.pharmeasy.basetest.*;
import capstone.pharmeasy.po.*;
import capstone.pharmeasy.utils.XLUtility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import capstone.pharmeasy.listeners.*;

@Listeners(TestListener.class)

public class PartnerTest extends Browser {
	
	
	  @Test(dataProvider = "testdata", priority = 1)
	  public void ValidFileds(String data1, String data2, String data3, String data4) throws Exception {
		  PartnerPO objpharmeasy = new PartnerPO(driver);
			objpharmeasy.scroll();
			objpharmeasy.click_close_login();
			Thread.sleep(2000);
			objpharmeasy.click_patner();
			Thread.sleep(2000);
//			objpharmeasy.ddt_submitform(data1, data2, data3, data4);
			objpharmeasy.ddt_submitform(data1, data2, data3, data4);
			Thread.sleep(2000);
//			objpharmeasy.clear_name();
//			Thread.sleep(5000);
			objpharmeasy.do_you_own_list();
			Thread.sleep(2000);
//			objpharmeasy.scroll();
//			Thread.sleep(3000);
			objpharmeasy.submit_btn();
			Thread.sleep(2000);
			WebElement response = driver.findElement(By.xpath("//h5[contains(@class,'mt-4 w-full text-center text-xl font-bold leading-normal text-black')]"));
			String data = response.getText();
			assertEquals(data, "Response Received");
			Thread.sleep(2000);
			objpharmeasy.Click_Okay();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		  
	  }
	  

	  @Test(dataProvider = "testdata_1", priority = 2)
	  public void BlankFields(String data1,String data2, String data3, String data4) throws Exception {
		  PartnerPO objpharmeasy = new PartnerPO(driver);
			objpharmeasy.click_patner();
			Thread.sleep(5000);
//			objpharmeasy.ddt_submitform(data1, data2, data3, data4);
			objpharmeasy.ddt_submitform_name_blank(data2, data3, data4);
			Thread.sleep(3000);
//			objpharmeasy.clear_name();
//			Thread.sleep(5000);
			objpharmeasy.do_you_own_list();
			Thread.sleep(5000);
//			objpharmeasy.scroll();
//			Thread.sleep(3000);
			objpharmeasy.submit_btn();
			Thread.sleep(5000);
			WebElement response_1 = driver.findElement(By.xpath("//div[@class='text-sm text-red-500']"));
			String data_1 = response_1.getText();
			assertTrue(data_1.contains("match the regex"));
//			objpharmeasy.validate_response_1();
			Thread.sleep(3000);
		  
		  
	  }
	  @DataProvider(name="testdata")
		public Object[][] dp() throws Exception {
			XLUtility configuration = new XLUtility(".//Data_Source//PharmEasy_data.xlsx");
			int rows = configuration.getRowCount(0);
			Object[][]signin_credentials = new Object[rows][4];

			for(int i=0;i<rows;i++)
			{
			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
			signin_credentials[i][2] = configuration.getData(0, i, 2);
			signin_credentials[i][3] = configuration.getData(0, i, 3);
			}
			return signin_credentials;
			}
		@DataProvider(name="testdata_1")
		public Object[][] dp_1() throws Exception {
			XLUtility configuration = new XLUtility(".//Data_Source//PharmEasy_data_1.xlsx");
			int rows = configuration.getRowCount(0);
			Object[][]signin_credentials = new Object[rows][4];

			for(int i=0;i<rows;i++)
			{
//			signin_credentials[i][0] = configuration.getData(0, i, 0);
			signin_credentials[i][1] = configuration.getData(0, i, 1);
			signin_credentials[i][2] = configuration.getData(0, i, 2);
			signin_credentials[i][3] = configuration.getData(0, i, 3);
			}
			return signin_credentials;
			}
//		@BeforeClass
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
//	  
	  
	}
