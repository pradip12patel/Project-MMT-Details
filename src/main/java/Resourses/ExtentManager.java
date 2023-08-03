package Resourses;

import org.testng.reporters.SuiteHTMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
	
	
	   public static ExtentReports report;
	   public static ExtentSparkReporter htmlreport;
	   public ExtentTest test;
	   
	   
	   
	public   static void setup()  {
		   
		   htmlreport =new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/Testresult/" + "Myreport_"+ BaseClass.getcurrenttime() + ".html");
		   
		   htmlreport.config().setDocumentTitle("Automation report");
		   htmlreport.config().setReportName("MMT Report");
		   htmlreport.config().setTheme(Theme.DARK);
		   
		   
		   report=new ExtentReports();
		   
		   report.attachReporter(htmlreport);
		   report.setSystemInfo("window10", "ios");
		   report.setSystemInfo("host name", "local");
		   report.setSystemInfo("tester name", "ravi");
		   
	   }
	
	public static void endreport()  {
		
		report.flush();
	}

}
