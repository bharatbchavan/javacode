package Tenstngallprogram;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retrylogic implements IRetryAnalyzer {

	
	int retrycount=2;
	int initialcount=0;
	@Override
	public boolean retry(ITestResult result) {
		
		
		if(initialcount<retrycount) {
		
		return true;
		
		}
		return false;
	}
  
	
}
