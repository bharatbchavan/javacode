package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtouploadfile {

	public static void main(String[] args) throws Exception {
		ChromeDriver b= new ChromeDriver();
		b.get("https://grotechminds.com/registration/");
		
		b.manage().window().maximize();
		Thread.sleep(2000);
		WebElement b1= b.findElement(By.id("file"));
		b1.sendKeys("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Automation testing all dependency url.txt");
		

	}

}
