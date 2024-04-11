package capstone.pharmeasy.cucumbertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"D:\\Testing\\FINAL\\pharmeasy_capstoneteam2_ncsautomation\\src\\test\\java\\capstone\\pharmeasy\\cucumbertest"},
		glue= {"capstone.pharmeasy.cucumbertest"},
//		plugin= {"html:target/cucumber-report.html"}
		plugin = { "me.jvt.cucumber.report.PrettyReports:target/cucumber" }
		
		)
public class PharmeasyTestRunner extends AbstractTestNGCucumberTests {
	
	

}
