package Testngbatch64;

import org.testng.annotations.Test;

public class Groupingtestcase {
	
	@Test(groups= {"smoke"})
	public void add() {
		
		System.out.println("this is add tc1");
	}
	
	@Test(groups= {"system","smoke"})
	public void add1() {
		
		System.out.println("this is add tc2");
	}
	
	@Test(groups= {"smoke"})
	public void add2() {
		
		System.out.println("this is add tc3");
	}
	
	@Test(groups= {"system"})
	public void add3() {
		
		System.out.println("this is add tc4");
	}

}
