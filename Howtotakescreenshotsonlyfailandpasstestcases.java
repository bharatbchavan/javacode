package Testngbatch64;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Howtotakescreenshotsonlyfailandpasstestcases implements ITestListener {

	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		TakesScreenshot ts = (TakesScreenshot) driver;

	    File src = ts.getScreenshotAs(OutputType.FILE);

		
		//step3
		File f1= new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Tatamevenproject\\screenshot\\Passs\\Passs"+new Howtotakescreenshotsonlyfailandpasstestcases().getClass()+Math.random()+".png");
		
		//step4
		try {
			FileHandler.copy(src, f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//step2
		File getscreenshot=ts.getScreenshotAs(OutputType.FILE);
		
		//step3
		File f1= new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Tatamevenproject\\screenshot\\Fail\\Fail"+Math.random()+".png");
		
		//step4
		try {
			FileHandler.copy(getscreenshot, f1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
	
	}
}
	
