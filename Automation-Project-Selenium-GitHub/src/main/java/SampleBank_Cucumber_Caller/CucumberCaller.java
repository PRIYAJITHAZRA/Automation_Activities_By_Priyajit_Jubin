package SampleBank_Cucumber_Caller;

import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;

import SampleBank_Utilities.Excel_Read;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"Resource\\Feature\\"},
    glue = {"SampleBank_Operation"},
    tags={"@Sanity"},
   plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/SampleBank_Automation_report.html"})
public class CucumberCaller {
	

	@AfterClass
	  public  static void teardown() {
		Excel_Read Ex = new Excel_Read();
	        Reporter.loadXMLConfig(Ex.Return_XML_File());
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("os", "Windows-10");
	        Reporter.setTestRunnerOutput("Sample test runner output  g o=``  message");
	        Reporter.addScenarioLog("Test");
	        
	    }
	}
	

