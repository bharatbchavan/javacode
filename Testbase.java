package Testngbatch64;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Testbase   {
	WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	
	public void launchbrowser(String nombofbrowser) {
		
		
		if(nombofbrowser.equalsIgnoreCase("chrome")) {
		driver= new ChromeDriver();
		
		}
		if(nombofbrowser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			
			}
	}
		
		@AfterMethod
		public void closedthebrowser() {
			
			driver.quit();
			
		}
	}
	


