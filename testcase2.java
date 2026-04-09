package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Howtotakescreenshotsonlyfailandpasstestcases.class)
public class testcase2 extends Testbase {
	@Test()
	public void clickonfirstproduct() throws Exception {
		
		Thread.sleep(2000);
	WebElement b1= driver.findElement(By.id("twotabsearchtextbox"));
	b1.sendKeys("Shoes"+Keys.ENTER);
	//clicking on first product
	Thread.sleep(2000);
	WebElement b2=driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
	b2.click();
	
	
	}

}
