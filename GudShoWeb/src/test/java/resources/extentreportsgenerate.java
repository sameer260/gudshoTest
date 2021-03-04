package resources;


import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.reporter.ExtentKlovReporter;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Resources.Base_setup;


public class extentreportsgenerate extends Base_setup {
public static ExtentSparkReporter reporter;



public extentreportsgenerate(String reportlocation)
{
	reporter=new ExtentSparkReporter(new File(reportlocation));
	
	ExtentReporter reports=new ExtentReports();

	/*extentreport=new ExtentReports();
	extentreport.attachReporter(htmlreporter);
	htmlreporter.config().setCSS("css-string");
	htmlreporter.config().setDocumentTitle("Web Automation");
	htmlreporter.config().setEncoding("utf-8");
	htmlreporter.config().setJS("js-string");
	htmlreporter.config().setProtocol(Protocol.HTTPS);
	htmlreporter.config().setReportName("QA-Cucumber Framework");
	htmlreporter.config().setTheme(Theme.DARK);
	htmlreporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");*/
	
	
}




}
