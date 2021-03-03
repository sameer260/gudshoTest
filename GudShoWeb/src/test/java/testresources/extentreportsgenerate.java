package testresources;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;

public class extentreportsgenerate {
private ExtentHtmlReporter htmlreporter;
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
		String testname=getscenariotitle(scenario);
		switch(scenario.getStatus())
		{
		case PASSED:
			extentreport.createTest(testname).pass("Passed");
			break;
		case FAILED:
			extentreport.createTest(testname).pass("failed");
			default:
				extentreport.createTest(testname).skip("skipped");
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
private String screenshotpath(String path)
{
	return "file:///" + path.replaceAll("\\", "//");
}
private static String getscenariotitle(Scenario scenario)
{
	return scenario.getName().replaceAll(" ", "");
}
}
