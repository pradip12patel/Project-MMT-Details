package TestRunner;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Resourses.BaseClass;
import Resourses.ConstantMethod;
import Resourses.PageObjectModel;

import org.apache.logging.log4j.*;

public class TestClass extends BaseClass  {
	
	PageObjectModel obj;
	
	
	@Test
	 void MMTApplication() throws InterruptedException   {
		 
		Logger log=LogManager.getLogger(TestClass.class);
		
		
		 obj=new PageObjectModel(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		try {
		
		WebElement frame=obj.frame();
		
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(1000);
		
		obj.framecancel().click();
		
		log.info("handle frame");
		
		driver.switchTo().defaultContent();
		
		 Thread.sleep(2000);
		 
		}
		catch (Exception e)  {
			
			e.printStackTrace();
			
			log.info("Not Handle frame");
		}                
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj.logi));
		wait.until(ExpectedConditions.elementToBeClickable(obj.logi));
		
	 //  WebElement w2=	driver.findElement(By.xpath("//p[@data-y='LoginHeaderText']"));
	
	  // JavascriptExecutor jc=(JavascriptExecutor) driver;
     
     //  jc.executeScript("arguments[0].click()", w2);  
		
	    WebElement w1=obj.fromm();
	
	     JavascriptExecutor js=(JavascriptExecutor) driver;
	     
	     js.executeScript("arguments[0].click()", w1);   
			
	     Thread.sleep(2000);
	     
	  //   w1.sendKeys("pune");
		
	    obj.fromcity().sendKeys(ConstantMethod.fromcity);
	    
	    Thread.sleep(3000);
	    
	    
	   WebElement e= obj.cityname();
	    
	    JavascriptExecutor jv=(JavascriptExecutor) driver;
	     
	     jv.executeScript("arguments[0].click()", e); 
		
	/*	List<WebElement> w=driver.findElements(By.xpath("//li//div//div//p"));
		
		  for(int i=0;i<=w.size()-1;i++)  {
			  
			  System.out.println(w.size());
			  
			  if(w.get(i).getText().equalsIgnoreCase("Aurangabad, India")) {
				  
				     JavascriptExecutor jv=(JavascriptExecutor) driver;
				     
				     jv.executeScript("arguments[0].click()", w.get(i)); 
				 
				     break;
					  	  
				  }
			      else {
				  
				  System.out.println("put correct");
				   break;
				
			}     
			  
		}            */
	    
	    
	    WebElement web= obj.to();
	    
	    JavascriptExecutor jk=(JavascriptExecutor) driver;
	     
	    jk.executeScript("arguments[0].click()", web);
	    
	    obj.tocity().sendKeys(ConstantMethod.tocity);
	    
	    WebElement  el=obj.cityname1();
	    
	    JavascriptExecutor je=(JavascriptExecutor) driver;
	     
	    je.executeScript("arguments[0].click()", el); 
		
	    log.info("Test Case Is Passed");
	    
	    
	    
	    
	    
	    
	 }

}
