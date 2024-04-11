package capstone.pharmeasy.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.pharmeasy.locators.LocatorConfig;

public class OrderValuePO {
	
	WebDriver driver;
	@FindBy(xpath=LocatorConfig.orderVal)
	WebElement orderval;
	@FindBy(xpath=LocatorConfig.searchtxt)
	WebElement searchtxt;
	@FindBy(xpath=LocatorConfig.selecttxt)
	WebElement selecttxt;
	@FindBy(xpath=LocatorConfig.viewmore)
	WebElement viewmore;
	@FindBy(xpath=LocatorConfig.firstOption)
	WebElement firstoption;
	@FindBy(xpath=LocatorConfig.secondOption)
	WebElement secondoption;
	@FindBy(xpath=LocatorConfig.applybtn)
	WebElement applybtn;
	@FindBy(xpath=LocatorConfig.product)
	WebElement product;
	@FindBy(xpath=LocatorConfig.getText)
	WebElement getText;
	@FindBy(xpath=LocatorConfig.ordervalAddtocart)
	WebElement ordervalAddtocart;
	@FindBy(xpath=LocatorConfig.addordervalQuantity)
	WebElement addordervalQuantity;
	@FindBy(xpath=LocatorConfig.addsimilarProduct)
	WebElement addsimilarProduct;
	@FindBy(xpath=LocatorConfig.addsimProductQuant)
	WebElement addsimProductQuant;
	@FindBy(xpath=LocatorConfig.homePage)
	WebElement homePage;
	
	
	
	public OrderValuePO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void orderVal(String str) throws InterruptedException {
		orderval.click();
		searchtxt.sendKeys(str);
		selecttxt.click();
		viewmore.click();
		firstoption.click();
		Thread.sleep(1000);
		secondoption.click();
		Thread.sleep(1000);
		applybtn.click();
		product.click();
	}
	
	public boolean getText() {
		return getText.isDisplayed();
	}
	
	public void addtoCart() {
		ordervalAddtocart.click();
		addordervalQuantity.click();
		addsimilarProduct.click();
		addsimProductQuant.click();
		
	}
	
	public void homePage() {
		homePage.click();
	}


}
