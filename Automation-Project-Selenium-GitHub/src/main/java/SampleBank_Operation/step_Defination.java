package SampleBank_Operation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import com.cucumber.listener.Reporter;

import SampleBank_PageObjects.*;
import SampleBank_Reports_and_Logs.CustomException;
import cucumber.*;
import com.cucumber.listener.Reporter;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_Defination
{	static samplePage_A Log_in_Page = new samplePage_A();
	 samplePage_B inbox = new samplePage_B();
	 @Given("^Operation_1$")
	 public void Sucessful_Application_Login() throws Exception {


		Log_in_Page.Page_Loader();
		Log_in_Page.Set_User_Name();
		Log_in_Page.Set_Password();
		Log_in_Page.Click_Login_Button();
		

	
}
	 @When("^Operation_2$")	 
public void Gmail_page_not_loaded_in_Firefox_Browser( )
{
		 int X =1/0;
}
	 @Then("^Operation_3$")
	 public void Gmail_page_not_loaded_in_Firefox_Browser_Test( )
	 {
	 
	 }
	 
	 @Given ("^Operation_4$")
	 public void Scenario_To_Test_Pacs008_Collection()
	 {
		 System.out.println("Test6");
	 }
	 
	 @When("^Operation_5$")
	 public void Scenario_To_Test_Pacs008_Collection_Via_MQ()
	 {
		 System.out.println("Test3");
	 }
	 @Then("^Operation_6$")
	 public void Scenario_To_Test_Pacs008_Collection_Via_MQ_2()
	 {
		 System.out.println("Test9");
	 }
}



//public class Entry_Point extends JUnitTestClass {

	//public Entry_Point() {
	
		// TODO Auto-generated constructor stub
	//}