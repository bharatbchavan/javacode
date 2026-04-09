package Testngbatch64;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launchthewebsiteinincognitomode {

	public static void main(String[] args) {
		ChromeOptions c= new ChromeOptions();
		
	c.addArguments("headless");
	
	ChromeDriver b=new ChromeDriver(c);
	b.get("https://grotechminds.com/registration/");
	
	System.out.println("url is opend");

	}

}
