package Testngbatch64;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotpassandfailTC implements ITestListener {
	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File f1=ts.getScreenshotAs(OutputType.FILE);
		
		File f2= new File("C:\\testdata-folder\\testdate-sheet.xlsx"+Math.random()+".png");
		
		FileHandler.copy(f1, f2);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		

		TakesScreenshot ts=(TakesScreenshot) driver;
		File f1=ts.getScreenshotAs(OutputType.FILE);
		
		File f2= new File("C:\\testdata-folder\\testdate-sheet.xlsx"+Math.random()+".png");
		
		FileHandler.copy(f1, f2);
	}


	
	@
}
