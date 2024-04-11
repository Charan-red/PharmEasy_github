package capstone.pharmeasy.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {
	
	WebDriver driver;
	
	@FindBy(css = "div[class='c-PJLV c-bXbWpx c-bXbWpx-iheOjaG-css'] div[class='c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-fMErMJ-justify-left c-bXbWpx-joJbDg-align-center c-bXbWpx-ijAXJbh-css']")
	public 
    WebElement clickdeliverycode;
    
    @FindBy(xpath = "//input[@placeholder='Enter PIN Code']") public WebElement inputdeliverycode;
    
    @FindBy(css = "button[type='submit']") public WebElement check_deliverycode;
    
    @FindBy(css = ".c-PJLV.c-bXbWpx.c-bXbWpx-ijZCdNJ-css") public WebElement Clickon_cross;
    
    @FindBy(id = "discoverOfferings-1") public WebElement navigateTo_medicinepage;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); 
    }
    
    public void Scroll() throws InterruptedException {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
    }
    
    public void click_deliverycode() {
    	clickdeliverycode.click(); 
    }
  
    public void input_deliverycode(String pincode) throws InterruptedException {
    	inputdeliverycode.sendKeys(pincode);
    }
    
    public void check_deliverycode() throws InterruptedException {
    	check_deliverycode.click();
  
    }
    
    public void Clickoncross() {
    	Clickon_cross.click();
    }
    
    public void navigateTomedicinepage() {
    	navigateTo_medicinepage.click();
    }




    
}
