package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

public class Testcases11 extends Testbaseclass {
	
	@Test(retryAnalyzer=Retrylogic.class)
	
	public void entervalueinsearchfield() throws Exception {
	Thread.sleep(2000);
	WebElement b1=driver.findElement(By.id("twotabsearchtextbox"));
	b1.sendKeys("shoes" + Keys.ENTER);
		
		
	}

}
