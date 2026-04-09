package Testngbatch64;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver b= new ChromeDriver();
		b.get("file:///C:/Users/DELL/Downloads/employee.html");
		b.manage().window().maximize();
      //i need to count all rows
	List<WebElement>listrow=	b.findElements(By.tagName("tr"));
int totalrow=	listrow.size();
System.out.println(totalrow);
	}

}
