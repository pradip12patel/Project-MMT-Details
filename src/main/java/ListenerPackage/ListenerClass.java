package ListenerPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import Resourses.BaseClass;
import Resourses.ExtentManager;

public class ListenerClass extends ExtentManager implements ITestListener{
	
	
	public void onTestStart(ITestResult result) {
		
		test = report.createTest(result.getName());
	}
	
	
	public void onTestSuccess(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SUCCESS);
			
			test.log(Status.PASS, "tes case pass :" + result.getName());
		
	}
	
	
	
	public void onTestFailure(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE)  {
			
			test.log(Status.FAIL, "test case fail" + result.getName());
			
			test.log(Status.FAIL, "test case fail" + result.getThrowable());
			
			String screenshotpath ="";
			
			try {
			screenshotpath = BaseClass.getScreenshot(BaseClass.driver, result.getName());
			
			   test.addScreenCaptureFromPath(screenshotpath);
			
			}
			catch(Exception e)  {
				
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public void onTestSkipped(ITestResult result) {
		
		if(result.getStatus() == ITestResult.SKIP)  {
			
			test.log(Status.SKIP, "Test case skip :"+ result.getName());
		}
	}
	
	
	
	

}
