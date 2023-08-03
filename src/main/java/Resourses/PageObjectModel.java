package Resourses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectModel {
	
	WebDriver driver;
	
	       By fram=By.xpath("//iframe[@title='notification-frame-b8a68c66']");
	       By framecancl=By.xpath("//a[@class='close']");
	public By logi=By.xpath("//p[@data-cy='LoginHeaderText']");
	       By from=By.xpath("//span[@class='lbl_input appendBottom10']");
	       By fromcty=By.xpath("//div[@role='combobox']//input");
	       By cityput=By.xpath("//p[contains(text(),'Aurangabad, India')]");
	       By too=By.xpath("//span[normalize-space()='To']");
	       By toocity=By.xpath("//input[@placeholder='To']");
	       By putcity=By.xpath("//p[contains(text(),'Indore, India')]");
	//By from=By.xpath();
//	By from=By.xpath("");
	
	
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
	
	

}
