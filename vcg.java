package Tenstngallprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vcg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver b= new ChromeDriver();
		b.get("https://www.cleartrip.com/");
		b.manage().window().maximize();
		WebElement g=b.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div/child::*)[2]"));
           g.click();
	}

}
