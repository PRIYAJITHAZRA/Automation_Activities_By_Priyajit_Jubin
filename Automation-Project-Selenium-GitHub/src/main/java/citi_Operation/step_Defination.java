package Priyajit_Operation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;
import Priyajit_Page_Objects.*;
import Reports_Logs.CustomException;
import cucumber.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Method_operator
{	//static Gmail_Login_Page Log_in_Page = new Gmail_Login_Page();
	 //Gmail_Inbox inbox = new Gmail_Inbox();
	 @Given("^Pacs 008 file uploaded via SOAP$")
	 public void Sucessful_Application_Login() throws Throwable {
	/*try	   
	
	{
		Log_in_Page.Page_Loader();
		Log_in_Page.Set_User_Name();
		Log_in_Page.Set_Password();
		Log_in_Page.Click_Login_Button();
		
	}
catch (CustomException e) {
		// TODO Auto-generated catch block
		e.Print_Exception();
	}
	*/
	System.out.println("Test1");
	
}
	 @When("GPP receives the Pacs008 file")	 
public void Gmail_page_not_loaded_in_Firefox_Browser( )
{
System.out.println("Dummy ");
}
	 @Then("^Validate the payment instruction$")
	 public void Gmail_page_not_loaded_in_Firefox_Browser_Test( )
	 {
	 System.out.println("Dummy ");
	 }
	 
	 @Given ("^Pacs 008 file uploaded via MQ Simulator$")
	 public void Scenario_To_Test_Pacs008_Collection()
	 {
		 System.out.println("Test6");
	 }
	 
	 @When("^GPP receives from MQ the Pacs008 file$")
	 public void Scenario_To_Test_Pacs008_Collection_Via_MQ()
	 {
		 System.out.println("Test3");
	 }
	 @Then("^Validate the payment instruction received from MQ$")
	 public void Scenario_To_Test_Pacs008_Collection_Via_MQ_2()
	 {
		 System.out.println("Test9");
	 }
}


//public class Entry_Point extends JUnitTestClass {

	//public Entry_Point() {
	
		// TODO Auto-generated constructor stub
	//}