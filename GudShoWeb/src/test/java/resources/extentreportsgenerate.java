package resources;
/*package testresources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Resources.Base_setup;
import cucumber.api.Scenario;

public class extentreportsgenerate extends Base_setup {
private static ExtentHtmlReporter htmlreporter;
private static ExtentReports extentreport;


public extentreportsgenerate(String reportlocation)
{
	htmlreporter=new ExtentHtmlReporter(new File(reportlocation));
	extentreport=new ExtentReports();
	extentreport.attachReporter(htmlreporter);
}

public static void createTest(Scenario scenario) throws IOException
{
	if(scenario !=null)
	{
		String testname=scenario.getName();
		switch(scenario.getStatus())
		{
		case PASSED:
			extentreport.createTest(testname).pass("Passed");
			break;
		case FAILED:
			extentreport.createTest(testname).fail("Failed");
		default:
			break;
			
		}
	}

}

public static String screenshotm(String screenshotpath) throws IOException 
{ 
	return "file:///"+screenshotpath;
}
public static void writeareport()
{
	if(extentreport!=null)
	{
		extentreport.flush();
	}
}


}*/
