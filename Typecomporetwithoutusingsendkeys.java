package Testngbatch64;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Typecomporetwithoutusingsendkeys {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ChromeDriver b=new ChromeDriver();
		b.get("https://grotechminds.com/registration/");
		b.manage().window().maximize();
		WebElement firstname=b.findElement(By.id("fname"));
		//JavascriptExecutor js=(JavascriptExecutor)b;
		Thread.sleep(2000);
		b.executeScript("arguments[0].value='bharat'", firstname);
	}

}
