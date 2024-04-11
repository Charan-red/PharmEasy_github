package capstone.pharmeasy.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage {
WebDriver driver;
	
	public ProductDescriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "discoverOfferings-1") public WebElement navigateTo_medicinepage;
	
	@FindBy(xpath = "//input[@placeholder='Search medicines/Healthcare products ']")
	 public WebElement input_itemname;
	
	@FindBy(css = "div[class='ClickableElement_clickable__ItKj2 Typeahead_searchIcon__KGDGS']")
	 public WebElement select_item;
	
	@FindBy(className =  "ProductCard_infoContainer__Ro1Gi")
	public WebElement choose_product;
	
	@FindBy(xpath = "//a[@class='LanguageSelector_languageOption__m654k']") public WebElement change_language;
	
	
	public void navigateTomedicine() {
		navigateTo_medicinepage.click();
	}
	
	public void input_itemname(String item_name) {
		 input_itemname.sendKeys(item_name);
	 }
	
	public void selectitem() {
		select_item.click();
	}
	
	public void chooseproduct() {
		choose_product.click();
	}
	
	public void changelanguage() {
		change_language.click();
	}

}
