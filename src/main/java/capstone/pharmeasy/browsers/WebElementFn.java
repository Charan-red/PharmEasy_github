package capstone.pharmeasy.browsers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementFn {
	
static WebDriverWait wait;
	
	public static String getTextfromElement(WebElement element) {
		return element.getText();
	}
	
	public static void waitforPresenceofElementlocated(WebDriver driver, By loc, Duration timetowait) {
		wait = new WebDriverWait(driver, timetowait);
		wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}

}
