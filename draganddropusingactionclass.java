package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class draganddropusingactionclass {
	
	public class Mousesimulation {

		WebDriver driver;
			//hover over on webelements
			@BeforeMethod
			public void Launchtheurl() throws Exception {
	      
				driver= new ChromeDriver();
				Thread.sleep(2000);
				driver.get("https://grotechminds.com/drag-and-drop/");
				driver.manage().window().maximize();

}
			
			@Test
			public void doppebleanddragableelemen() {
				
		      WebElement b= driver.findElement(By.id("drag1"));
		      WebElement b1= driver.findElement(By.id("div2"));
		      
		      Actions act =new Actions(driver);
		      
		      act.dragAndDrop(b, b1).perform();
		      
		     // act.contextClick().perform();
		      
		      act.doubleClick().perform();
		      
			}}
			}
