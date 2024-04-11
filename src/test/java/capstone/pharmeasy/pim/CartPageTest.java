package capstone.pharmeasy.pim;

import org.testng.annotations.Test;

import capstone.pharmeasy.basetest.BaseTest;
import capstone.pharmeasy.po.CartPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class CartPageTest extends Browser{
	

	@Test
	public void AddToCart() throws InterruptedException {

		CartPage obj = new CartPage(driver);

		obj.navigateTomedicinepage();
		obj.inputmedicine("Dolo");
		obj.clicksearchmedicine();
		obj.addtocart();
		obj.addquantity();
		Thread.sleep(3000);
		obj.viewcart();
		Thread.sleep(3000);
		String expectedResultForCart =  obj.verifyCartText();
		AssertJUnit.assertEquals(expectedResultForCart, "1 Item in your Cart");
//		CartPage.removecart();
//		Thread.sleep(3000);
//		String expectedResultForRemoveCart =  CartPage.checkCartText();
//		assertEquals(expectedResultForRemoveCart, "0 Items in your Cart");
	}
	
	@Test
	public void RemoveCart() throws InterruptedException {
		
		CartPage obj = new CartPage(driver);
	
		obj.removecart();
		Thread.sleep(3000);
		String expectedResultForRemoveCart =  obj.checkCartText();
		AssertJUnit.assertEquals(expectedResultForRemoveCart, "0 Items in your Cart");
	}
	

//	@BeforeClass
//	public void beforeClass() {
//		driver = new ChromeDriver();
//		driver.get("https://pharmeasy.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//
//	}
//
//	@AfterClass
//	public void afterClass() {
//		driver.quit();
//	
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//
//	}
//
//	@AfterTest
//	public void afterTest() {
//		
//		
//		
	}


