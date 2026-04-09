package Testngbatch64;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Takepassandfailscreenshots implements ITestListener{

	public static WebDriver driver;
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		// we need to write logic hre
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2nd 
		File f=ts.getScreenshotAs(OutputType.FILE);
		//step3
		File f2=new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Tatamevenproject\\screenshot\\Passs\\Passtestss"+Math.random()+".png");
		try {
			FileHandler.copy(f, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		// we need to write logic hre
				TakesScreenshot ts=(TakesScreenshot) driver;
				//step 2nd 
				File f=ts.getScreenshotAs(OutputType.FILE);
				//step3
				File f2=new File("C:\\AUTOMATION CLASS-MANISH-SIR-ALL-SOFTWARE\\Tatamevenproject\\screenshot\\Fail\\Failtestcase"+Math.random()+".png");
				try {
					FileHandler.copy(f, f2);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
