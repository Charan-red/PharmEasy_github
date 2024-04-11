package capstone.pharmeasy.po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CareersPO {
	
	WebDriver driver;
	@FindBy(css = "body > div:nth-child(1) > main:nth-child(1) > div:nth-child(3) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > a:nth-child(3) > div:nth-child(1)")
	WebElement careers_link;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement close_login;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/a[1]/div[1]/span[1]")
	WebElement startapply_btn;
	@FindBy(xpath = "//*[@id=\"jobTitle\"]")
	WebElement job_title;
	@FindBy(xpath = "//app-multi-select[@formcontrolname='department']//span[@class='placeholder-text'][normalize-space()='Please select']")
	WebElement Department1;
	@FindBy(xpath = "//*[@id=\"dropdown-basic\"]/div[2]/li[5]/div/span/label")
	WebElement Department2;
	@FindBy(xpath = "//ng-select[@id='experience_from']//input[@role='combobox']")
	WebElement from1;
	@FindBy(xpath = "//*[@id=\"a0d7a2685eb7-1\"]")
	WebElement from2;
	@FindBy(xpath = "//ng-select[@id='experience_to']//input[@role='combobox']")
	WebElement to1;
	@FindBy(xpath = "//div[@id='ace67a61dca0-5']")
	WebElement to2;
	@FindBy(xpath = "//ng-select[@id='type']//input[@role='combobox']")
	WebElement Employeetype1;
	@FindBy(xpath = "//span[@class='ng-option-label'][normalize-space()='Full Time - Permanent']")
	WebElement Employeetype2;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/app-user-views[1]/div[2]/app-jobs-wrapper[1]/app-jobs[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/button[1]")
	WebElement search_btn;
	@FindBy(xpath = "//a[@class='clickable color-blue custom-theme-color']")
	WebElement validate;

	public CareersPO(WebDriver driver) {
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

	public void click_careers() {
		careers_link.click();
	}

	public void click_startapply_btn() {
		startapply_btn.click();
	}

	public void navigate_tab(String parentwindow) {
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(parentwindow)) {
				driver.switchTo().window(windowHandle);
				break;
			}
		}

	}

	public void jobtitle_name(String job) {
		job_title.sendKeys(job);
	}

	public void select_dep() throws Exception {
		Department1.click();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"dropdown-basic\"]/div[2]/li[5]/div/span/label"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Department2.click();
	}

	public void experence() throws Exception {
		from1.click();
		Thread.sleep(5000);
		from2.click();
		Thread.sleep(5000);
		to1.click();
		Thread.sleep(5000);
		to2.click();
	}

	public void employee_type() {
		Employeetype1.click();
		Employeetype2.click();
	}

	public void click_search_btn() { 
		search_btn.click();
	}

//	public void validate_data() {
//		String data = validate.getText();
//		assertTrue(data.contains("Test"));
//	}

	public void switch_parent(String parentwindow_1) {
		driver.switchTo().window(parentwindow_1);
	}

	public void jobtitle_name_1() {
		job_title.clear();
		
	}

}
