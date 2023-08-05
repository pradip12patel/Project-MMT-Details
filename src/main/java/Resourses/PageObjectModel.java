package Resourses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
	
	WebDriver driver;
	
	       By fram=By.xpath("//iframe[@title='notification-frame-b8a68c66']");
	       By framecancl=By.xpath("//a[@class='close']");
	public By logi=By.xpath("//p[@data-cy='LoginHeaderText']");
	       By trip=By.xpath("//ul[@class='fswTabs latoRegular darkGreyText ']//li//span");
	       By from=By.xpath("//span[@class='lbl_input appendBottom10']");
	       By fromcty=By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']//div//input");
	       By cityput=By.xpath("//p[contains(text(),'Mumbai, India')]");
	       By too=By.xpath("//span[normalize-space()='To']");
	       By toocity=By.xpath("//input[@placeholder='To']");
	       By putcity=By.xpath("//p[contains(text(),'Indore, India')]");
	       By next=By.xpath("//span[@aria-label='Next Month']");
           By title=By.xpath("(//div[@class='DayPicker-Caption'])[1]");
           By date=By.xpath("(//div[@class='DayPicker-Body'])[1]//div//div//p");
	       By date1=By.xpath("(//div[@class='DayPicker-Body'])[2]//div//div//p");
	       By travel=By.xpath("//span[@class='lbl_input appendBottom5']");
	       By adult=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[1]//li");
	       By child=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[2]//li");
	       By infront=By.xpath("(//ul[@class='guestCounter font12 darkText gbCounter'])[3]//li");
	       By classes=By.xpath("(//ul[@class='guestCounter classSelect font12 darkText'])[1]//li");
	       By apply=By.xpath("(//button[@type='button'])[1]");
	       By serch=By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']");
	       By asset=By.xpath("((//div[@class='filtersOuter'])[1]//p)[1]");
	       
	 public PageObjectModel(WebDriver driver2)   {
		 
		 this.driver=driver2;
	 }
	
	
	public WebElement frame()  {
		
	return	driver.findElement(fram);
			
	}
	
	public WebElement framecancel()  {
		
		return	driver.findElement(framecancl);
				
		}
	
    public WebElement loginbutton()  {
		
		return	driver.findElement(logi);
				
		}
    
    public List<WebElement> roundtrip()  {
		
    	return	driver.findElements(trip);
    			
    	}
	
	
	public WebElement fromm()  {
		
		return	driver.findElement(from);
				
		}
	
	
	public WebElement fromcity()  {
		
		return	driver.findElement(fromcty);
				
		}
	
	public WebElement cityname()  {
		
		return	driver.findElement(cityput);
				
		}
	
	
	public WebElement to()  {
		
		return	driver.findElement(too);
				
		}
	
	
	public WebElement tocity()  {
		
		return	driver.findElement(toocity);
				
		}
	
	
	public WebElement cityname1()  {
		
		return	driver.findElement(putcity);
				
		}
	
   public WebElement clicknext()  {
		
		return	driver.findElement(next);
				
		}
   
   public WebElement titles()  {
		
		return	driver.findElement(title);
				
		}
   
   public List<WebElement> dates()  {
	   
	   return driver.findElements(date);
   }
   
   public List<WebElement> dates1()  {
	   
	   return driver.findElements(date1);
   }
   
   
   public WebElement travelling()  {
		
		return	driver.findElement(travel);
				
		}
   
    public List<WebElement> adultseat()  {
	   
	   return driver.findElements(adult);
   }
    
    public List<WebElement> childern()  {
 	   
 	   return driver.findElements(child);
    }
    
    public List<WebElement> infrontseat()  {
 	   
 	   return driver.findElements(infront);
    }
    
    public List<WebElement> seatclass()  {
  	   
  	   return driver.findElements(classes);
     }
    
    
    public WebElement clickapply()  {
		
		return	driver.findElement(apply);
				
		}
 
    public WebElement search()  {
		
		return	driver.findElement(serch);
				
		}
    
    public WebElement assertion()  {
		
		return	driver.findElement(asset);
				
		}

}
