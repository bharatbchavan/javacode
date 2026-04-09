package Tenstngallprogram;

import java.net.http.WebSocket;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtocopyonefiledtestinanotherfiledinselenium {

	public static void main(String[] args) throws Exception {
		
		WebDriver b= new ChromeDriver();
		b.get("https://grotechminds.com/registeration-form/");
		
		b.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement b1=b.findElement(By.id("firstName"));
		b1.sendKeys("Bharat");
		
		b1.sendKeys(Keys.CONTROL+"a");
		
		b1.sendKeys(Keys.CONTROL+"c");
		
		WebElement b2=b.findElement(By.id("lastName"));
		
		b2.sendKeys(Keys.CONTROL+"v");
		

	}

}
