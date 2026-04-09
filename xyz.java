package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver b=new ChromeDriver();
		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
	WebElement	insrt=b.findElement(By.id("twotabsearchtextbox"));
	
	insrt.sendKeys("bharat");

	}

}
