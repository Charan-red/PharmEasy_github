package capstone.pharmeasy.webfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String EDGE = "edge";

	public static WebDriver getInstance(String browserName) {
		if (browserName == null || browserName.isEmpty()) {
			throw new IllegalArgumentException("Browser name cannot be null or empty");
		}

		WebDriver driver;

		switch (browserName.toLowerCase()) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;
		default:
			throw new IllegalArgumentException("Unsupported Browser: " + browserName);
		}

		return driver;
	}

}
