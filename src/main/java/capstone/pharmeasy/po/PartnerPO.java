package capstone.pharmeasy.po;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PartnerPO {
	
	WebDriver driver;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement close_login;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[3]/div[1]/div[1]/div[1]/div[2]/a[4]/div[1]")
	WebElement Partner_link;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Full_name;
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement mobile;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement email;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
	WebElement pincode;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/select[1]")
	WebElement own_pharmacy;
	@FindBy(xpath="//div[contains(@class,'mt-[95px] hidden lg:flex')]//div//button[contains(@type,'button')][normalize-space()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//h5[contains(@class,'mt-4 w-full text-center text-xl font-bold leading-normal text-black')]")
	WebElement response;
	@FindBy(xpath="//div[@class='text-sm text-red-500']")
	WebElement response_1;
	@FindBy(xpath="//div[@id='thankyou']//div[3]//button[1]")
	WebElement okay;
	public PartnerPO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scrollBy(0, 2500)");
	}

	public void click_close_login() {
		close_login.click();
	}
	public void click_patner() {
		Partner_link.click();
	}
	public void ddt_submitform(String name, String mobil, String email_id, String pincode_1) {
		Full_name.sendKeys(name);
		mobile.sendKeys(mobil);
		email.sendKeys(email_id);
		pincode.sendKeys(pincode_1);
	}
	public void ddt_submitform_name_blank(String mobil, String email_id, String pincode_1) {
//		Full_name.sendKeys(name);
		mobile.sendKeys(mobil);
		email.sendKeys(email_id);
		pincode.sendKeys(pincode_1);
		
	}
	public void clear_name() {
		Full_name.clear();
	}
	public void do_you_own_list() {
		Select dropdown = new Select(own_pharmacy);
		dropdown.selectByValue("no");
	}
	public void submit_btn() {
//		 Actions actions = new Actions(driver);
//
//	        // Move to the middle of the button and click
//	        actions.moveToElement(submit).moveByOffset(submit.getSize().getWidth() / 2, submit.getSize().getHeight() / 2).click();
		((JavascriptExecutor) driver).executeScript("var element = arguments[0];" +
                "var rect = element.getBoundingClientRect();" +
                "var clientX = rect.left + (rect.width / 2);" +
                "var clientY = rect.top + (rect.height / 2);" +
                "var evt = document.createEvent('MouseEvents');" +
                "evt.initMouseEvent('click', true, true, window, 1, clientX, clientY, 0, 0, false, false, false, false, 0, null);" +
                "element.dispatchEvent(evt);", submit);

	}
//	public void validate_response() {
//		String data = response.getText();
//		assertEquals(data, "Response Received");
//	}
//	public void validate_response_1() {
//		String data_1 = response_1.getText();
//		assertTrue(data_1.contains("match the regex"));
//	}
	public void Click_Okay() {
		okay.click();
	}

}
