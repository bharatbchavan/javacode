package Testngbatch64;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanakyser implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		
		int rtrycount=2;
		int intialcont=0;
		
		if(intialcont<rtrycount)
		{
			intialcont++;
			
			return true;
		
		}
		
		return false;
	}
	
	

}
