package Tenstngallprogram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandleusing {

	public static void main(String[] args) throws InterruptedException {
		// if you have 5 windows int you need to print all window titile
		ChromeDriver b= new ChromeDriver();

		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
		Thread.sleep(2000);
		
	WebElement b1=	b.findElement(By.id("twotabsearchtextbox"));
	b1.sendKeys("shoes" + Keys.ENTER);
	Thread.sleep(2000);
   List<WebElement> list1=b.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
   
  int count= list1.size();
  System.out.println(count);
  
  //i nned to click on first 4 product using for loop
  Thread.sleep(2000);
  for(int i=0;i<5;i++) {
	  
	  list1.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
	 
	 
  }
	  //i need to count windows
	  Set<String> allwindow=b.getWindowHandles();
	  
	
	 System.out.println(allwindow);
	 
	 // i need to switch on 2nd window so that i need to convert set in to list
	 
	 List<String> s=new ArrayList<>(allwindow);
	 Thread.sleep(2000);
	String c1= s.get(0);
	String c2= s.get(1);
	String c3= s.get(2);
	String c4= s.get(3);
	 String c5= s.get(4);
	 
	 /*Iterator<String> b8 =s.iterator();

	String part= b8.next();
	String child1= b8.next();
	 String child2=b8.next();
	String child3= b8.next();
	String child4= b8.next();*/
	
	Thread.sleep(2000);
	b.switchTo().window(c2);
	
	System.out.println(b.getTitle());
  }
  
  
	
	
	
	}


