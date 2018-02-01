/**
 * 
 */
package citi_Operation;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;

import org.testng.annotations.Test;

import citi_Utilities.*;
/**
 * @author Priyajit
 *
 */
public class Execution_Controller {
static Excel_Read Excel_read= new Excel_Read();
static String Test_Case;
static List<String> Test_Methods;
String[] Run_Time_Test_Methods; 
static HashMap<String , List<String>> Test_Config;
static Method[] Getmethods;

@Test
void Execution_Start() throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
//public static void main(String args[]) throws ClassNotFoundException, IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, NoSuchMethodException, SecurityException
, NoSuchMethodException, SecurityException

{
	System.setProperty("webdriver.chrome.driver", "G:\\Priyajit-JAVA-Project-Work\\Selenium-End-End-Fresh-Project\\Resource\\chromedriver_win32\\chromedriver.exe");
	Test_Config= Excel_read.getValue(Test_Config);
	//Read the Hashmap using Map.Entryset() cast the hashmap to set.
	Set Test_Config_Set =(Set)Collections.synchronizedMap(Test_Config).entrySet();
	Iterator itr= Test_Config_Set.iterator();
	Class Get_Methods= Class.forName("Priyajit_Operation.Method_operator");
	step_Defination method_Operator=new citi_Operation.step_Defination();
	while(itr.hasNext())
	{
		if(itr.hasNext()==true)
		{
		Map.Entry mapEntry = (Map.Entry) itr.next();
		Test_Case=(String) mapEntry.getKey();
		Test_Methods=Test_Config.get(Test_Case);
		for (String Test_Method_From_input_Sheet :Test_Methods )
		{
			 {
	     		Method method= Get_Methods.getDeclaredMethod(Test_Method_From_input_Sheet);
				method.invoke(method_Operator);
			 }
		 }
		}
		else
		{
			break;
		}
		}		
	}
private static Method[] Get_Run_time_Methods () throws ClassNotFoundException
{
	
	Class Get_Methods= Class.forName("Priyajit_Operation.Method_operator");
	Getmethods=Get_Methods.getMethods();
	return Getmethods;	
}

private static Object Get_Instance() throws ClassNotFoundException, InstantiationException, IllegalAccessException
{
	Class Get_Methods= Class.forName("Priyajit_Operation.Method_operator");
	Object Obj=Get_Methods.newInstance();
	return Obj;	
}
	
@Test

public static void Test()
{
	System.out.println("Test");
}


}
	
	
