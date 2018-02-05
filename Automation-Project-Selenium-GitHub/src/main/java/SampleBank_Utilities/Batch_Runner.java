/**
 * 
 */
package SampleBank_Utilities;

import java.io.File;
import java.io.OutputStreamWriter;
 
import org.codehaus.plexus.util.cli.CommandLineException;
import org.codehaus.plexus.util.cli.CommandLineUtils;
import org.codehaus.plexus.util.cli.Commandline;
import org.codehaus.plexus.util.cli.WriterStreamConsumer;
/**
 * @author Priyajit
 *
 */
public class Batch_Runner {
	


	public class BatchRunner {

		public BatchRunner() {
			
			
			// ---------------------------- Sample Batch File---------------------------------------------------------------------
			//echo off
			//title My test Batch File
			//:: See title at the top.
			//move C:\test1folder\*.txt C:\test2folder
			//echo test file executed.
			//pause
			
			
			//------------------------------ Running jar file from Batch file ----------------------------------------------------
			
			/* In case we need to run the jar file we need to update the command in the the batch file itself 
			 * create a batch file with .bat extension with the following contents

			Option 1 ------------------------------------------------------------ 
			Use java for .jar that does not have UI and is a command line application

			@ECHO OFF
			start java -jar <your_jar_file_name>.jar
			Use javaw for .jar that has a UI

	        Option 2 ------------------------------------------------------------ 
	        Use javaw for .jar that has a UI
	         
			@ECHO OFF
			start javaw -jar <your_jar_file_name>.jar
			
			Please make sure your JAVA_HOME is set in the environment variables.
				
			 * 
			 */
			//-----------------------------------------------------------------------------------------------------------------------
			String batfile = "batchfile.bat";
			String directory = "C:\\";
			try {
				runProcess(batfile, directory);
			} catch (CommandLineException e) {
				e.printStackTrace();
			}
		}
		
		public void runProcess(String batfile, String directory) throws CommandLineException {
			
			Commandline commandLine = new Commandline();
			
			File executable = new File(directory + "/" +batfile);
			commandLine.setExecutable(executable.getAbsolutePath());
			
			WriterStreamConsumer systemOut = new WriterStreamConsumer(
		            new OutputStreamWriter(System.out));
			
			WriterStreamConsumer systemErr = new WriterStreamConsumer(
		            new OutputStreamWriter(System.out));
	 
			int returnCode = CommandLineUtils.executeCommandLine(commandLine, systemOut, systemErr);
			if (returnCode != 0) {
			    System.out.println("Something Bad Happened!");
			} else {
			    System.out.println("Execution Successful");
			};
		}
	 
		

	}

}
