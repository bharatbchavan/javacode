package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtohandleautosuggestionusingkeyfunction {

	public static void main(String[] args) throws Exception {
		
		WebDriver b= new ChromeDriver();
		Thread.sleep(20000);
		b.get("https://www.google.com/");
		
		b.manage().window().maximize();
		
		Thread.sleep(20000);
    WebElement b1=b.findElement(By.name("q"));
    
    b1.sendKeys("java");
    
    b1.sendKeys(Keys.ARROW_DOWN);
    b1.sendKeys(Keys.ARROW_DOWN);
    b1.sendKeys(Keys.ENTER);
	}

}
