package Runner;

import java.io.File;


import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.reporter.ExtentBDDReporter;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentHtmlReporterConfiguration;

//import com.vimalselvam.cucumber.listener.ExtentProperties;
//import com.vimalselvam.cucumber.listener.Reporter;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

//import com.vimalselvam.cucumber.listener.ExtentProperties;
//import com.vimalselvam.cucumber.listener.Reporter;
import Resources.Base_setup;


@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features= "Features/Frontend/BStudioprofile.feature",
glue={"Steps",},
tags= {"@fail1"},
//tags= {"@minititle1"},
plugin = {//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		 "json:Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports",
		 "json:target/cucumber-reports/cucumber.json",
		 "rerun:target/rerun.txt"},
//plugin= {"json:D:\\sameerworkspace\\GudSho\\jsonfolder\\reports.json"},
//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},
monochrome=true)


					
public class RunnerTest extends Base_setup
{	
	
	@BeforeClass
	public static void extent() throws IOException
	{
		
	  //ExtentProperties extentprop=ExtentProperties.INSTANCE;
	 // String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	  //extentprop.setReportPath(System.getProperty("user.dir")+"\\ExtentReports\\Report"+timestamp+".html");
	 // PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\log4j.properties");
	//extent();
		
	
	}

	/*@AfterClass
	public static void setup()
	{	
		//extent.reporter.spark.config="src/test/resources/extent-config.xml";
	
	/*Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\java\\Resources\\extent-config.xml"));
	Reporter.setSystemInfo("User Name", "Sameer");
	Reporter.setSystemInfo("Application Name", "GudSho ");
	Reporter.setSystemInfo("GudSho", "QA");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	JVMreports.generatejvmreport("Cucumber.json");*/
	
	
	//}
	
}