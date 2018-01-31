package Cucumber_Wrapper;

import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"Resource\\Feature\\"},
    glue = {"Priyajit_Operation"},
    tags="@Sanity",
   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/Citi_Automation_report.html"})
public class CucumberCaller {
	

	@AfterClass
	  public  static void teardown() {
	        Reporter.loadXMLConfig(new File("G:\\Priyajit-JAVA-Project-Work\\Selenium-End-End-Fresh-Project\\Resource\\Extent_Config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows-10");
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	        Reporter.addScenarioLog("Test");
	    }
	}
	

