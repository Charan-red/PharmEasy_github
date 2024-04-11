package capstone.pharmeasy.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.pharmeasy.locators.LocatorConfig;

public class FeatureBrandPO {
	
	WebDriver driver;
	
	@FindBy(xpath=LocatorConfig.featurebrandtxt)
	WebElement featurebrandtxt;
	@FindBy(xpath=LocatorConfig.featureproduct)
	WebElement featureproduct;
	@FindBy(xpath=LocatorConfig.featureproductSelect)
	WebElement featureproductSelect;
	@FindBy(xpath=LocatorConfig.asserttxt)
	WebElement asserttxt;
	@FindBy(xpath=LocatorConfig.featureAdd)
	WebElement featureAdd;
	@FindBy(xpath=LocatorConfig.addfeatureQuantity)
	WebElement addfeatureQuantity;
	@FindBy(xpath=LocatorConfig.viewfeaturecart)
	WebElement viewfeaturecart;
	@FindBy(xpath=LocatorConfig.removeFromCart)
	WebElement removeFromCart;
	@FindBy(xpath=LocatorConfig.remove)
	WebElement remove;
	@FindBy(xpath=LocatorConfig.assertremovestatment)
	WebElement assertremovestatment;
	@FindBy(xpath=LocatorConfig.homePage)
	WebElement homePage;
	
	
	public FeatureBrandPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean brandtxtPresent() {
		return featurebrandtxt.isDisplayed();
	}
	
	public void isproductPresent() throws InterruptedException {
		
		featureproduct.click();
		
	}
	
	public void clickPrduct() {
		featureproductSelect.click();
	}
	
	
	
	public Boolean checktext() {
		return asserttxt.isDisplayed();
	}
	
	public void addtoCart() {
		featureAdd.click();
		addfeatureQuantity.click();
		viewfeaturecart.click();
		removeFromCart.click();
		remove.click();
	}

	public boolean assertremovecart() {
		return assertremovestatment.isDisplayed();
	}
	
	public void clickHomepage() {
		homePage.click();
	}

}
