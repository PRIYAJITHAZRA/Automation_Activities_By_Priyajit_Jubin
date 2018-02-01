package citi_PageObjects;

import java.io.File;
import java.sql.DriverAction;

import javax.swing.Spring;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import citi_Reports_and_Logs.*;
import citi_Utilities.*;

public class Gmail_Login_Page
{
	static Property_Read PR= new Property_Read();
	//static WebDriver Driver = new ChromeDriver();
	static WebDriver Driver = new FirefoxDriver();
	public static void Page_Loader()throws CustomException
	{
		Property_Read PR= new Property_Read();
	    Driver.get(PR.Read_Property_File("URL"));
	}
	
	public static void Set_User_Name() throws CustomException, InterruptedException
	{  
		WebElement UserName = Driver.findElement(ByXPath.xpath(PR.Read_Property_File("User_Name")));
		UserName.sendKeys(PR.Read_Property_File("Priviliged_User_Name"));
		WebElement User_Name_Next= Driver.findElement(ByXPath.xpath(PR.Read_Property_File("User_Name_Next")));
		User_Name_Next.submit();
		Thread.sleep(5000);
	}
	public static void  Set_Password() throws ElementNotFoundException
	{
		WebElement Password = Driver.findElement(ByXPath.xpath(PR.Read_Property_File("Password")));
		Password.sendKeys(PR.Read_Property_File("Priviliged_User_Password"));
		
	}
	public void Click_Login_Button() throws CustomException, InterruptedException
	{
		WebElement Password_Name_Next= Driver.findElement(ByXPath.xpath(PR.Read_Property_File("Password_Next")));
		Password_Name_Next.submit();
		Thread.sleep(5000);
	}
	}




	

