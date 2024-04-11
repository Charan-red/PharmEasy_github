package capstone.pharmeasy.pim;

import org.testng.annotations.Test;

import capstone.pharmeasy.po.ProductDescriptionPage;

public class ProductDescriptionTest extends Browser{
	 @Test
	  public void Change_Product_Page_Language() throws InterruptedException {
		  
	 
		  ProductDescriptionPage obj = new capstone.pharmeasy.po.ProductDescriptionPage(driver);
		  
		  obj.navigateTomedicine();
		  obj.input_itemname("Pan 40");
		  obj.selectitem();
		  obj.chooseproduct();
		  obj.changelanguage();
		  Thread.sleep(5000);
		  
		  
	  }
}
