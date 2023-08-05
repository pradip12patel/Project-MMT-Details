package Resourses;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class CommonMethod {
	
	 public static void listhandle(List<WebElement> w, String date, WebDriver driver)    {
		 
		 List<WebElement> li=w;
		 
		 for(WebElement s:li)  {
			 
			 if(s.getText().equalsIgnoreCase(date))  {
			 
				 JavascriptExecutor jq=(JavascriptExecutor) driver;
				 
				 jq.executeScript("arguments[0].click()", s); 
			     break;
		 }
		 
		 }  
		 
	 }
	 
	 public static void clickable(WebElement e, WebDriver driver)   {
		 
		 JavascriptExecutor js=(JavascriptExecutor)  driver;
		 
		 js.executeScript("arguments[0].click()", e);
	 }
	
	 
	 public static void handleassertion(String s1, String s2, String message)   {
		 
		 SoftAssert s=new SoftAssert();
		 
		 String actual=s1;
		 String expected=s2;
		 
		 s.assertEquals(s1, s2, "message");
		 
	 }

}
