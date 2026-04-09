package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Howtotakescreenshotsonlyfailandpasstestcases.class)
public class Testcase1 extends Testbase{
	
	//launch the the browser and and enter the value inside the search field 
	
	@Test()
	public void Launchthebrowserandenterthevalueinsidesearchfield() throws Exception {
		Thread.sleep(2000);
		WebElement b1= driver.findElement(By.id("tweotabsearchtextbox"));
		Thread.sleep(2000);
		b1.sendKeys("Shoes"+Keys.ENTER);
		
		
		
	}

}
