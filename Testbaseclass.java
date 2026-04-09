package Testngbatch64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class Testbaseclass extends Howtotakescreenshotsonlyfailandpasstestcases{
	//1st i want to do the cross browser testing

  @Parameters("Browser")
  @BeforeMethod
  
  public void Launchbrowser(String noofbrowser) throws Exception {
	
	  if(noofbrowser.equalsIgnoreCase("chrome")) {
	  driver=new ChromeDriver();
	  
	  }  
	  
	  if(noofbrowser.equalsIgnoreCase("edge")) {
		  driver=new EdgeDriver();
		  
		  }  
	  
	  if(noofbrowser.equalsIgnoreCase("firfox")) {
		  driver=new FirefoxDriver();
		  
		  }  
	  Thread.sleep(2000);
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  
          }
  
  /*@AfterMethod
  
  public void closethewindow() {
	  
	  driver.close();*/
  }
  
  


