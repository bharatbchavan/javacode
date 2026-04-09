package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollupandscrolldown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver b=new ChromeDriver();
		b.get("https://grotechminds.com/registration/");
		b.manage().window().maximize();
		
		WebElement b1= b.findElement(By.id("file"));
		
		Point h=b1.getLocation();
		
		int j=h.getX();
		System.out.println(j);
		int j1=h.getY();
		System.out.println(j1);
		
		
		
		//I need to upcasting the javascriptexecutore
		//JavascriptExecutor js=(JavascriptExecutor) b;
		Thread.sleep(2000);
		//i need to scroll down the given ponit
		b.executeScript("window.scrollBy(0,"+j1+")");
		

	}

}
