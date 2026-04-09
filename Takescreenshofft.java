package Tenstngallprogram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshofft {
	
	public static void main(String[] args) throws Exception {
		
		ChromeDriver b= new ChromeDriver();
		b.get("https://www.amazon.in/");
		b.manage().window().maximize();
		
		//upcasting the takescreenshote interface
		Thread.sleep(3000);
		TakesScreenshot ts=b;
		Thread.sleep(3000);
		//using getscreenshotas() method to take screenshot
		 File fe=ts.getScreenshotAs(OutputType.FILE);
		 Thread.sleep(3000);
		 //using file class object to stron the screen shot
		 File f1= new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Tatamevenproject\\screenshot\\ss"+Math.random()+".png");
		
		 //copy the screenshot using File handler
		 Thread.sleep(3000);
		 org.openqa.selenium.io.FileHandler.copy(fe, f1);
		 b.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
