package Testngbatch64;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TesttheoneTCwithmultipledata {
	
	@Test(dataProvider = "datapro")
	public void asdfg(String input)
	{
		ChromeDriver b= new ChromeDriver();
		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement f=b.findElement(By.id("twotabsearchtextbox"));
		
		f.sendKeys(input +Keys.ENTER);
		
		
	}
	@DataProvider
	public Object datapro() {
		Object [][] d1=new Object[4][1];
		d1[0][0]="bharat";
		d1[1][0]="wroti";
		d1[2][0]="boti";
		d1[3][0]="choti";
		
		
		return d1;
		
		
		
	}

}
