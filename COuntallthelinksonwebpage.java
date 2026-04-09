package Tenstngallprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class COuntallthelinksonwebpage {

	public static void main(String[] args) throws Exception {
		ChromeDriver b= new ChromeDriver();

		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement>v=b.findElements(By.tagName("a"));
int cout	=	v.size();
System.out.println(cout);

//i need to prrnt the all link

for(int i=0;i<v.size();i++) {
	
	WebElement g=v.get(i);
	String f=g.getAttribute("href");
	String h=g.getText();
	System.out.println(h);
	System.out.println(f);
}
		
	}

}
