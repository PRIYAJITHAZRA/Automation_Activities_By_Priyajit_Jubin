package SampleBank_Reports_and_Logs;
import SampleBank_Reports_and_Logs.*;
public class CustomException extends Exception{

	/*CustomException(String S)
	{
		super(S);
	}
	public void Print_Exception()
	{
		citi_Reports_and_Logs.ReportAndLog.SetLog("Exception Occured During runtime");;
	}
	*/
	
	public static String Error_Details(Exception E )
	{
		return E.getMessage();
		
	}
	
}
