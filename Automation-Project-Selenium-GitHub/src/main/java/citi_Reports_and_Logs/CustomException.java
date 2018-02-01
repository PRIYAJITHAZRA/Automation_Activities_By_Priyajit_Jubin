package citi_Reports_and_Logs;
import citi_Reports_and_Logs.*;
public class CustomException extends Exception{

	CustomException(String S)
	{
		super(S);
	}
	public void Print_Exception()
	{
		citi_Reports_and_Logs.ReportAndLog.SetLog("Exception Occured During runtime");;
	}
}
