package capstone.pharmeasy.pim;

import org.testng.annotations.Test;

import capstone.pharmeasy.basetest.BaseTest;
import capstone.pharmeasy.listeners.TestListener;
import capstone.pharmeasy.po.HomePage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
@Listeners(TestListener.class)
public class HomePageTest  extends Browser {
	
	capstone.pharmeasy.po.HomePage HomePage;
	
	
	@Test(priority=1)
	public void check_valid_deliverycode() throws InterruptedException {

	   HomePage obj  = new capstone.pharmeasy.po.HomePage(driver);

		// TC016
		obj.click_deliverycode();
		obj.input_deliverycode("400076");
		obj.check_deliverycode();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void check_invalid_deliverycode() throws InterruptedException {
		
		HomePage obj  = new capstone.pharmeasy.po.HomePage(driver);
		
		// TC017
		obj.click_deliverycode();
		obj.input_deliverycode("5675");
		obj.check_deliverycode();
		Thread.sleep(10000);
		obj.Clickoncross();
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void check_notinservice_deliverycode() throws InterruptedException {
		
		HomePage obj  = new capstone.pharmeasy.po.HomePage(driver);
	
		// TC017
		obj.click_deliverycode();
		obj.input_deliverycode("756464");
		obj.check_deliverycode();
		obj.Clickoncross();
		Thread.sleep(5000);
		obj.navigateTomedicinepage();
		Thread.sleep(5000);
	}

//	@BeforeTest
//	public void beforeTest() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://pharmeasy.in/");
//
//	}
//
//	@AfterTest
//	public void afterTest() {
//
//		driver.quit();
//	}

}
