package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertesting {
	
	WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
	public void launchthebrowser(String numberofbrowser) {
		
		if(numberofbrowser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		
		if(numberofbrowser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}
		
		if(numberofbrowser.equalsIgnoreCase("firfox")) {
			driver=new FirefoxDriver();
		}
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Reporter.log("Browser launched");
			
		}
	
		
		@AfterMethod
		public void closedthebrowser() {
			
			//driver.quit();
			Reporter.log("Browser quite");
		}
		
		@Test
		public void Testcase1() throws Exception {
			Thread.sleep(2000);
			
		WebElement b1=	driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		b1.sendKeys("Bharat");
		Reporter.log("test case1 enter the value in search filed but not clicked");
		}
		
		@Test
		public void testcase2() throws Exception {
			Thread.sleep(2000);
			WebElement b1=	driver.findElement(By.id("twotabsearchtextbox"));
			
			b1.sendKeys("Bharat" + Keys.ENTER);
			Reporter.log("test case1 enter the value in search filed but clicked");
			
			// i need to click on 
		}
		
	}


