package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Mousesimulation {

	WebDriver driver;
		//hover over on webelements
		@BeforeMethod
		public void Launchtheurl() throws Exception {
      
			driver= new ChromeDriver();
			Thread.sleep(2000);
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
		}
			@Test
			public void mousehoveroveronwebelement() throws Exception {
				Thread.sleep(2000);
				WebElement b1=driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
				//Thread.sleep(2000);
				Actions act=new Actions(driver);
				Thread.sleep(2000);
				act.moveToElement(b1).perform();
				
				
				
			}
			
			@AfterMethod
			public void closed() throws Exception {
				Thread.sleep(6000);
				driver.close();
			
			
			

	}

}
