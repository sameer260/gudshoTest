package resources;


/*import java.io.File;
import java.io.IOException;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

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
	htmlreporter.config().setCSS("css-string");
	htmlreporter.config().setDocumentTitle("Web Automation");
	htmlreporter.config().setEncoding("utf-8");
	htmlreporter.config().setJS("js-string");
	htmlreporter.config().setProtocol(Protocol.HTTPS);
	htmlreporter.config().setReportName("QA-Cucumber Framework");
	htmlreporter.config().setTheme(Theme.DARK);
	htmlreporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
	
	
}

public static void createTest(Scenario scenario,String screenshotpath) throws IOException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException
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
			extentreport.createTest(testname).fail("Failed").addScreenCaptureFromPath(screenshotpath);
		default:
			break;
			
		}
	}

}
public static void writeareport()
{
	if(extentreport!=null)
	{
		extentreport.flush();
	}
}


}*/
