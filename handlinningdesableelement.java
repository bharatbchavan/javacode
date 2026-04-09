package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinningdesableelement {

	public static void main(String[] args) throws Exception {
		ChromeDriver b= new ChromeDriver();
		b.get("https://the-internet.herokuapp.com/dynamic_controls");
		b.manage().window().maximize();
		
		//handling desable webelement and  enter the name is bharat
		
		WebElement b2=b.findElement(By.xpath("//input[@type='text']"));
		
		JavascriptExecutor js=b;
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeattribute('disabled')", b2);
		b2.sendKeys("bharat");
		

	}

}
