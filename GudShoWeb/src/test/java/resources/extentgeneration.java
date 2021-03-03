package resources;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class extentgeneration 
{

	public extentgeneration(String path)
	{
	
	ExtentHtmlReporter html = new ExtentHtmlReporter(path);
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(html);
	html.config().setAutoCreateRelativePathMedia(true);

	// provide the path of the image and it will be automatically referenced
	// in the markup relative to the report
	//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("1.png").build());
	//test2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("2.png").build());
	
	}
}
