package citi_Utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property_Read {
//This is responsible to read the Property file
	
	
 public String Read_Property_File(String Key)
	{
		Properties Pro = new Properties();
		String Value = null;
		InputStream InputStream = getClass().getClassLoader().getResourceAsStream("Object_Repo.properties");
		try {
			Pro.load(InputStream);
			Value=  Pro.getProperty(Key);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//Call the log method here to print the error if there are any
			e.printStackTrace();
		}
		return Value;
		}
	
}
