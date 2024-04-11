package capstone.pharmeasy.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtility {
	
	public static String capturescreenshot(WebDriver driver,String str)throws IOException {
		String filepath = System.getProperty("user.dir")+"/Screenshots/"+str+".png";
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File(filepath);
		
		FileUtils.copyFile(source, destination);	
		
		return filepath;
	}
}
