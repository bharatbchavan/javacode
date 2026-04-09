package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Searchamazonwithmultiplesetofdata {
	
	@Test(dataProvider="searchdetails")
	public void launchthebrowser(String input) throws Exception {
		
		ChromeDriver b= new ChromeDriver();
		
		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
		Thread.sleep(2000);
		WebElement b1= b.findElement(By.id("twotabsearchtextbox"));
		
		b1.sendKeys(input +Keys.ENTER);
		
	}
		
		@DataProvider
		public Object searchdetails() {
			
			Object [][] d1=new Object[3][1];
			
			d1[0][0]="shoes";
			d1[1][0]="pen";
			d1[2][0]="pencile";
			
			return d1;

			
		}
		

	

}
