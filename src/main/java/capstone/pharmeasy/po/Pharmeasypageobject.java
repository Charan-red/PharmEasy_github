package capstone.pharmeasy.po;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.pharmeasy.locators.LocatorConfig;

public class Pharmeasypageobject {

	
	WebDriver driver;
	@FindBy(xpath=LocatorConfig.search)
	WebElement search;
	WebElement topBarInput;
	@FindBy(xpath=LocatorConfig.firstProduct)
	WebElement firstProduct;
	@FindBy(xpath=LocatorConfig.text1)
	WebElement text1;
	@FindBy(xpath=LocatorConfig.addToCart)
	WebElement addToCart;
	@FindBy(xpath=LocatorConfig.addQuantity)
	WebElement addQuantity;
	@FindBy(xpath=LocatorConfig.viewCart)
	WebElement viewCart;
	@FindBy(xpath=LocatorConfig.textContent)
	WebElement textContent;
	@FindBy(xpath=LocatorConfig.homePage)
	WebElement homePage;
	
	//---------------------------------------------------------------------------------------------------------------
	
	
	public Pharmeasypageobject(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void serachText(String str) {
		search.click();
		topBarInput.sendKeys(str);
		topBarInput.sendKeys(Keys.ENTER);
		firstProduct.click();
	}
	
	public String getText() {
		return text1.getText();
	}
	
	public void addtocart() {
		addToCart.click();
		addQuantity.click();
		viewCart.click();
	}
	public boolean textContent() {
		 return textContent.isDisplayed();
	}
	
	public void homePage() {
		homePage.click();
	}
	
	

}
