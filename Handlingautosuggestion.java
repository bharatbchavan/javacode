package Tenstngallprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingautosuggestion {

	public static void main(String[] args) throws Exception {
		ChromeDriver b= new ChromeDriver();
		b.get("https://www.google.com/");
		b.manage().window().maximize();
		
	 WebElement b1=b.findElement(By.name("q"));
	 b1.sendKeys("JAVA");
	 Thread.sleep(2000);
	 List<WebElement> b2= b.findElements(By.xpath("//ul[@role='listbox']/li"));
	
int count=	 b2.size();
System.out.println(count);

b2.get(count-10).click();
	 
	 
		
	}

}
