package capstone.pharmeasy.cucumbertest;
 
import static org.testng.Assert.assertEquals;
 
import java.time.Duration;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 
 
public class PharmeasyStepDef {
WebDriver driver;
public void Scroll() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,1300)");
	
}
	@Before
	public void init() {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@After
	public void closed() {
		driver.close();
	}
	@Given("the user in health package functionality")
	public void the_user_in_health_package_functionality() {
		driver.get("https://pharmeasy.in/");
	}
 
	@When("i click on tab labtest")
	public void i_click_on_tab_labtest() {
		driver.findElement(By.xpath("//a[@class='c-iWbDBM c-iWbDBM-ijWwrnY-css'][normalize-space()='Lab Tests']")).click();
	}
 
	@When("i select health package option")
	public void i_select_health_package_option() {
		driver.findElement(By.xpath("//a[normalize-space()='Health Packages']")).click();
	}
 
	@When("i select any one package")
	public void i_select_any_one_package() {
		driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/a[3]/div[2]/button[1]")).click();
	}
 
	@When("i select patient")
	public void i_select_patient() {
		driver.findElement(By.xpath("//p[normalize-space()='2 patients']")).click();
	}
 
	@When("i click view cart")
	public void i_click_view_cart() {
		driver.findElement(By.xpath("//div[@class='showDesktop']//button[@type='submit'][normalize-space()='View Cart']")).click();
	}
 
	@When("i click remove option")
	public void i_click_remove_option() {
		driver.findElement(By.xpath("//img[@id='cart-card-0-delete']")).click();
	}
 
	@When("i click yes option")
	public void i_click_yes_option() {
		driver.findElement(By.xpath("//div[@id='alert']//div[@class='sc-fcab2434-0 jJLnpm']//div[1]")).click();
	}
 
	@Then("Your cart is empty, please add Tests\\/Packages to proceed. should be displayed")
	public void your_cart_is_empty_please_add_tests_packages_to_proceed_should_be_displayed() {
		String msg=driver.findElement(By.xpath("//p[@class='sc-446652e5-6 bUuqfg']")).getText();
		assertEquals(msg,"Your cart is empty, please add Tests/Packages to proceed.");
		
		}
	//----------------------------------------------------------------------------------------------------------------

	
	@Given("I navigate to the {string} category")
		public void i_navigate_to_the_category(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-idabOfh-css']//img[@alt='Personal care']")).click();
		}
	@When("I select a product")
		public void i_select_a_product() {
		    // Write code here that turns the phrase above into concrete actions
//		    driver.findElement(By.xpath("//a[@title='Nirvasa Anti Ageing Brightening Face Cream With Niacinamide Vitamin-A & C & Peptides (50 G)']//div[@class='ProductCard_productCard__A4yTy']")).click();
			driver.findElement(By.cssSelector("body > div:nth-child(1) > main:nth-child(3) > div:nth-child(1) > div:nth-child(2) > section:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1)")).click();
	}
	@When("I add the product to my cart")
		public void i_add_the_product_to_my_cart() throws Exception {
		    // Write code here that turns the phrase above into concrete actions
		    driver.findElement(By.xpath("//div[@class='OverviewSection_addUpdateButtonContainer__h1csR']//button[@id='proceed']")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
		    Thread.sleep(5000);
		    }
	//----------------------------------------------------------------------------------------------------------------
	
	@When("User navigate to the {string} category")
	public void user_navigate_to_the_category(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Scroll();
		driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icoXwRg-css']")).click();
		Scroll();
		driver.findElement(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-idabOfh-css']//div[@id='cat-7']//div[@class='c-PJLV c-bXbWpx c-bXbWpx-ifOmEpR-css']")).click();
		
	}

	@Then("User select the sort by discount")
	public void user_select_the_sort_by_discount() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//div[@class='MuiFormControl-root Select_formControlContainer__QWbdr']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Discount']")).click();
		Thread.sleep(3000);
		
	}
 
}