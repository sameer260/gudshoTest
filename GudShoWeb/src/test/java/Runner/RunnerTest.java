package Runner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Resources.Base_setup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.sorting.SortingMethod;
import resources.extentreportsgenerate;

//import testresources.extentreportsgenerate;



@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features",
glue={"Steps"},
tags= {"@test1"},
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"pretty","json:target/cucumber-reports/Cucumber.json", 
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},

		monochrome=true)


					
public class RunnerTest extends Base_setup
{	
	ExtentSparkReporter reporter;
	
	@BeforeClass
	public static void logger() {
		//String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		//new extentreportsgenerate("Extenreports//Testreport"+timestamp+".html");
		new ExtentSparkReporter("ExtentReports/reports.html");
		
		PropertyConfigurator.configure("log4j.properties");

	}
	
	
	@AfterClass
	public static void JVMreports() throws IOException {
		
		
		extentreportsgenerate.reporter.loadXMLConfig("src/test/resources/spark-config.xml");
		File reportOutputDirectory = new File("target/JVM");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target/cucumber-reports/Cucumber.json");
		String buildNumber = "1";
		String project = "gudsho";
		Configuration configuration = new Configuration(reportOutputDirectory, project);
		configuration.setBuildNumber(buildNumber);
		configuration.addClassifications("Environment", "QA");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Platform", "Windows 10");
		configuration.setSortingMethod(SortingMethod.NATURAL);
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();
		
	 }

	
}