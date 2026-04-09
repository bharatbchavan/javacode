package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdown {

	public static void main(String[] args) throws Exception {
	
		ChromeDriver b= new ChromeDriver();
		Thread.sleep(20000);
		b.get("https://grotechminds.com/registeration-form/");
		
		b.manage().window().maximize();
		
		Thread.sleep(20000);
		
		//using action select class i need to handle the drop down
		WebElement b1=b.findElement(By.id("gender"));
		Select s1= new Select(b1);
		Thread.sleep(20000);
		
		//1st method selectbyindex goiging to select sgender as female
		s1.selectByIndex(1);
		s1.selectByVisibleText("Other");

	}

}
