package capstone.pharmeasy.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import capstone.pharmeasy.locators.LocatorConfig;

public class PrescriptionUploadPO {
	
	WebDriver driver;
	@FindBy(xpath=LocatorConfig.clicklabTest)
	WebElement clicklabTest;
	@FindBy(xpath=LocatorConfig.uploadPrescription)
	WebElement uploadPrescription;
	@FindBy(xpath=LocatorConfig.homePage)
	WebElement homepage;
	
	public PrescriptionUploadPO(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		}
	
	public void homePage() {
		homepage.click();
	}
	
	public void clickLabTest() {
		clicklabTest.click();
	}
	
	public void AddPrescription() {

		uploadPrescription.click();
	}


}
