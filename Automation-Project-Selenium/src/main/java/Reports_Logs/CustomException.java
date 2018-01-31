package Reports_Logs;
import Reports_Logs.*;
public class CustomException extends Exception{

	CustomException(String S)
	{
		super(S);
	}
	public void Print_Exception()
	{
		Reports_Logs.ReportAndLog.SetLog("Exception Occured During runtime");;
	}
}
