package capstone.pharmeasy.pim;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import capstone.pharmeasy.listeners.TestListener;
import capstone.pharmeasy.po.FeatureBrandPO;
import capstone.pharmeasy.po.OrderValuePO;
import capstone.pharmeasy.po.Pharmeasypageobject;
import capstone.pharmeasy.po.PrescriptionUploadPO;


@Listeners(TestListener.class)
public class PharmeasyTest extends Browser {

	
	
	@Test(priority=1)
	  public void pharmeasySearchtest() throws InterruptedException {
		  
		  Pharmeasypageobject pom=new Pharmeasypageobject(driver);
		  pom.serachText("dolo");
		  Thread.sleep(2000);
		  assertEquals(pom.getText(),"Dolo 650mg Strip Of 15 Tablets");
		  assertTrue(pom.textContent());
		  Thread.sleep(1000);
	  
	  }
		
		
		@Test(priority=2)
		public void featureBrandtest() throws InterruptedException {
			FeatureBrandPO fbp=new FeatureBrandPO(driver);
			fbp.clickHomepage();
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN).build().perform();
			driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icoXwRg-css']")).click();
			
			assertTrue(fbp.brandtxtPresent());
			fbp.isproductPresent();
			fbp.clickPrduct();
			assertTrue(fbp.checktext());
			fbp.addtoCart();
			assertTrue(fbp.assertremovecart());
			
			
		}
	  
	  
	  
	  @Test(priority=3)
	  public void pharmeasyOrderFromValuetest() throws InterruptedException {
		  OrderValuePO ovp= new OrderValuePO(driver);
		  ovp.homePage();
		  ovp.orderVal("Liveasy");
		  Thread.sleep(2000);
		  assertTrue(ovp.getText());
		  Thread.sleep(2000);
		  ovp.addtoCart();
	  }
	  
	  
	  
	  @Test(priority=4)
	  public void testFileUpload() throws InterruptedException, AWTException {
		  PrescriptionUploadPO pp=new PrescriptionUploadPO(driver);
		  pp.homePage();
		  pp.clickLabTest();
		 
		  
		 Actions action = new Actions(driver);
		  
		 action.moveToElement(driver.findElement(By.xpath("//div[@class='_2IiDw']"))).click().build().perform();
		  
		  Thread.sleep(3000);
		  String filepath1= "D:\\Testing\\prescription.jpg";
		
		  StringSelection strselect = new StringSelection(filepath1);
		  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		  
		  clipboard.setContents(strselect,null);
		  
		  Thread.sleep(5000);
		  Robot robot = new Robot();
		  
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_V);
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  
		  Thread.sleep(3000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyRelease(KeyEvent.VK_ENTER);
		  
		  Thread.sleep(5000);

	  }

	}
