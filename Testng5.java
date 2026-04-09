package Tenstngallprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng5 {
  
	@Test
	public void testcas11() {
    System.out.println("Test case1");
	}
	@BeforeTest
	public void bt() {
    System.out.println("Before test");
	}
	@BeforeSuite
	public void bs() {
    System.out.println("Before suite");
	}
	@BeforeClass
	public void bc() {
    System.out.println("Before class");
	}
	@BeforeMethod
	public void bm() {
    System.out.println("Before method");
	}
	
	@Test
	public void testcas2() {
    System.out.println("Test case2");
	}
	@AfterClass
	public void ac() {
    System.out.println("After class");
    
	}
	@AfterMethod
	public void am() {
    System.out.println("After method");
	}
	@AfterSuite
	public void as() {
    System.out.println("After suite");
}
	
	@AfterTest
	public void at() {
    System.out.println("After test");
}
	
}
