package Testngbatch64;

import org.testng.annotations.Test;

public class Grouptc1 {
	
	@Test(groups= {"smoke","system"})
	public void Testcase1() {
		
		System.out.println("Test cae1");
	}

	@Test(groups= {"smoke"})
	public void Testcase2() {
		
		System.out.println("Test cae1");
	}
	
	@Test(groups= {"smoke"})
	public void Testcase3() {
		
		System.out.println("Test cae1");
	}
	@Test(groups= {"integration"})
	public void Testcase4() {
		
		System.out.println("Test cae1");
	}
	
	@Test(groups= {"integration"})
	public void Testcase5() {
		
		System.out.println("Test cae1");
	}
	
	@Test(groups= {"integration"})
	public void Testcase6() {
		
		System.out.println("Test cae1");
	}
}
