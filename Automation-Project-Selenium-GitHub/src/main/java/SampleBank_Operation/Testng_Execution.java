package SampleBank_Operation;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.*;

public class Testng_Execution {


	

	public void CreateDyanamicSuit()
	{
		
		XmlSuite xmlsuite = new XmlSuite();
		xmlsuite.setName("Test_Suite");
		xmlsuite.addListener("");
		xmlsuite.setParallel("Methods");
		XmlTest xmltest= new XmlTest(xmlsuite);
		xmltest.setName("Test_Case");
		XmlClass UsedClass= new XmlClass(Execution_Controller.class);
		List<XmlClass> xmlClasses= new ArrayList();
		xmlClasses.add(UsedClass);
		xmltest.setClasses(xmlClasses);
		List <XmlSuite> XmlSuites= new ArrayList ();
		XmlSuites.add(xmlsuite);
		TestNG testng =new TestNG();
		testng.setXmlSuites(XmlSuites);
		testng.run();
		
}

/*public static void main()
{
	TestNG testng =new TestNG();
	//XmlClass UsedClass= new XmlClass(Execution_Controller.class);
	
	testng.setTestClasses(new Class[]{Execution_Controller.class});
	testng.run();
	System.out.println("kkkkkkkk");
}
}*/
}
