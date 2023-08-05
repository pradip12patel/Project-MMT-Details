package Resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class BaseClass {
	
	public static WebDriver driver;
	public Properties prop;
	
	
	public void DriverInilitize() throws IOException  {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\data.properties");
		
	    prop=new Properties();
		prop.load(file);
		
		String key1=prop.getProperty("browser");
		
		if(key1.equalsIgnoreCase("chrome"))  {
			
			//ChromeOptions opt=new ChromeOptions();
			
			//opt.addArguments("start-maximized");
			//opt.addArguments("disable-infobars");
			//opt.addArguments("--disable-extension");
			
			 ChromeOptions op=new ChromeOptions();
		     op.addArguments("--remote-allow-origins=*"); 
		     op.addExtensions(new File("./Extection/AdGuard.crx"));
		     op.addArguments("--disable-notifications");
		 //    op.setBrowserVersion("117");
		     op.setBinary("G:\\chrome-win32\\chrome.exe");
		//   op.setBinary("C:\\Users\\LENOVO\\.cache\\selenium\\chrome\\win64\\116.0.5845.49\\chrome.exe");
		 //    op.setBinary("C:\\Users\\LENOVO\\.cache\\selenium\\chrome\\win64\\117.0.5926.0\\chrome.exe");
	    	  
	    	 driver=new ChromeDriver(op); 
		}
		else if(key1.equalsIgnoreCase("firefox"))  {
			
		 driver=new FirefoxDriver();
		}
		else {
			
			System.out.println("check the browser name");
		}
	}
	
	@BeforeSuite
	public void sbeforesuite()  {
		
		ExtentManager.setup();
		
	  }

	

	@BeforeMethod
	public void openurl() throws IOException   {
		
		DriverInilitize();
		
		String key2=prop.getProperty("url");
		
		driver.get(key2);
	}
	
	@AfterMethod
	public void closebrowser()  {
		
		driver.manage().window().maximize();
	}
	
	

	
	@AfterSuite
	public void aftersuite()   {
		
		ExtentManager.endreport();
	}
	
	
	  public static String getScreenshot(WebDriver driver, String screenshotname) throws IOException {
			
			String dateformate = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			
			TakesScreenshot ts= (TakesScreenshot) driver;
			
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			String destination = System.getProperty("user.dir") + "/failtest/" + screenshotname + dateformate + ".png";
			
			File finalDestination = new File(destination);
			 
			FileUtils.copyFile(source, finalDestination);
			   
			return destination;
		}
	  
	  public static String getcurrenttime()    {
		  
		  String currenttime= new SimpleDateFormat("yyyy-MM-ddhhmmss").format(new Date());
		  
		  return currenttime;
		  
		  
	  }
	

}
