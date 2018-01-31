/**
 * 
 */
package Priyajit_Page_Objects;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

import Resource_Reader.*;

/**
 * @author Priyajit
 *
 */
public class Gmail_Inbox extends Gmail_Login_Page {
	
	public static void delete_operation()
	{
		WebDriverWait Wait = new WebDriverWait(Driver, 5);
		WebElement Check_Element = Driver.findElement(ByXPath.xpath(PR.Read_Property_File("Check_Box")));
		Check_Element.click();
		//Select DropDown= new Select(Element);
		//DropDown.selectByValue("Unread");
		WebElement Delete= Driver.findElement(ByXPath.xpath(PR.Read_Property_File("Delete_Button")));
		Delete.click();
		//WebElement Message= Driver.findElement(ByXPath.xpath(PR.Read_Property_File("Delete_Button")));		
		WebElement Message = Wait.until(ExpectedConditions.presenceOfElementLocated(ByXPath.xpath(PR.Read_Property_File("Delete_Button"))));
		String S = Message.getText();
		System.out.println("Delete"+S);
	}

}


