package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class testcase12 extends Testbaseclass {
	
	
	@Test(retryAnalyzer=Retrylogic.class)
	public void searchproduct() throws Exception {
		
		WebElement b1=driver.findElement(By.id("twotabsearchtextbox"));
		b1.sendKeys("shoes" + Keys.ENTER);
			
		Thread.sleep(2000);
		WebElement b2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		b2.click();
		

		
	}


}
