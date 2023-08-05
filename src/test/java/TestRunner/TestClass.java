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
import Resourses.CommonMethod;
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
		
		JavascriptExecutor jy=(JavascriptExecutor)  driver;
		
		jy.executeScript("arguments[0].click()", obj.framecancel());
		
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
		
		
	//	CommonMethod.listhandle(obj.roundtrip(), "Round Trip", driver);
		
			List<WebElement> w=obj.roundtrip();
		
		  for(WebElement ww:w)  {
			  
			  System.out.println(ww.getSize());
			  
			  if(ww.getText().equalsIgnoreCase("Round Trip")) {
				  
				      ww.click();
				     break;
					  	
				  }
			  
		}            
	    
		
		log.info("trip type");
		
	   CommonMethod.clickable(obj.fromm(), driver);   
			
	     Thread.sleep(2000);
	     
	  //   w1.sendKeys("pune");
		
	    obj.fromcity().sendKeys(ConstantMethod.fromcity);
	    
	    Thread.sleep(3000);
	    
	    
	  CommonMethod.clickable(obj.cityname(), driver);
		
	
	    
	   CommonMethod.clickable(obj.to(), driver);
	    
	    obj.tocity().sendKeys(ConstantMethod.tocity);
	    
	   CommonMethod.clickable(obj.cityname1(), driver);
		
	    log.info("Test Case Is Passed");
	    
	    
	    String title="";
	    
	    while (!(title.equals("January 2024"))) {
			
	    	CommonMethod.clickable(obj.clicknext(), driver);
	    	
	    	WebElement titlefind=obj.titles();
	    	
	    	title=titlefind.getText();
			
		}
	    
	    CommonMethod.listhandle(obj.dates(),"20", driver);
	    
	    log.info("date selected :" + "20");
	    
	    
	    CommonMethod.listhandle(obj.dates1(), "5", driver);
	    
	    log.info("date selected :" + "5");
	    
	    
	    CommonMethod.clickable(obj.travelling(), driver);
	    
	    log.info("travel click");
	    
	    CommonMethod.listhandle(obj.adultseat(), ">9", driver);
	    
	    log.info("adult seat");
	    
	    CommonMethod.listhandle(obj.childern(), ">6", driver);
	    
	    log.info("childern seat");
	    
	    CommonMethod.listhandle(obj.infrontseat(), ">6", driver);
	    
	    log.info("infront seat");
	    
	    CommonMethod.listhandle(obj.seatclass(), "Premium Economy", driver);
	    
	    log.info("class select");
	    
	    Thread.sleep(4000);
	    
	    CommonMethod.clickable(obj.clickapply(), driver);
	    
	    log.info("apply");
	    
	    CommonMethod.clickable(obj.search(), driver);
	    
	    log.info("search successfully");
	    
	    
	    CommonMethod.handleassertion(obj.assertion().getText(), "Popular Filters", "check the value");
	    
	    log.info("Handle assertion");
	    
	 }

}
