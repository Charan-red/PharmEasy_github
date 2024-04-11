package capstone.pharmeasy.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	public CartPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(id = "discoverOfferings-1") public WebElement navigateTo_medicinepage;
	 
	 @FindBy(xpath = "//input[@placeholder='Search medicines/Healthcare products ']")
	 public WebElement input_medicine;
	 
	 @FindBy(css = "div[class='ClickableElement_clickable__ItKj2 Typeahead_searchIcon__KGDGS']")
	 public WebElement click_searchMedicine;
	 
	 @FindBy(id = "proceed") public WebElement addtocart_btn;
	 
	 @FindBy(xpath = "//li[normalize-space()='1']") public WebElement add_quantity;
	 
	 @FindBy(css = "body > div:nth-child(1) > main:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > button:nth-child(3)") public WebElement viewcart_btn;
	 
	 @FindBy(xpath = "//div[@class='ClickableElement_clickable__ItKj2 style_mobileQuantityButton___5FNk styles_quantitySelector__k8NWU']")
	 public WebElement viewcart_quantity;
	 
	 @FindBy(xpath = "//div[@class='ClickableElement_clickable__ItKj2 style_close__F_E37']") public WebElement clickon_cardpopupbtn;
	 
	 @FindBy(xpath = "//span[@class='style_cartCount__1ZoSI']") public WebElement cartText;
	 
	 @FindBy(css = "div[class='styles_cartCount__uDXZh'] span") public WebElement removeCartText;
	 
	 @FindBy(css = ".styles_removeItemButton___h5Hc")  public WebElement removeicon;
	 
	 @FindBy(xpath = "//div[@class='ClickableElement_clickable__ItKj2 style_button__rZqYO']") public WebElement remove_btn;
	 
	 
	 public void navigateTomedicinepage() {
		 navigateTo_medicinepage.click();
	 }
	 
	 public void inputmedicine(String medicine_name) {
		 input_medicine.sendKeys(medicine_name);
	 }
	 
	 public void clicksearchmedicine() {
		 click_searchMedicine.click();
	 }
	 
	 public void addtocart() {
		 addtocart_btn.click();
	 }
	 
	 public void addquantity() {
		 add_quantity.click();
		
	 }
	 
	 public void viewcart() {
		 viewcart_btn.click();
		 clickon_cardpopupbtn.click();
	 }
	 
	 String cartTestText = "";
		
	 public String verifyCartText() {
		 cartTestText = cartText.getText();
		 return cartTestText;
	 }
	 
	 public void removecart() {
		 removeicon.click();
		 remove_btn.click();	 
	 }
	 
	 public String checkCartText() {
		 cartTestText = removeCartText.getText();
		 return cartTestText;
	 }

}
