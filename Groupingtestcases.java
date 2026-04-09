package Tenstngallprogram;

import org.testng.annotations.Test;

public class Groupingtestcases {

	@Test(groups= {"smoke"})
	public void add() {

		System.out.println("add test");
}
	@Test(groups= {"smoke"})
	public void add1() {

		System.out.println("add test");
}
	@Test(groups= {"system"})
	public void add2() {

		System.out.println("add test");
}
	@Test(groups= {"smoke"})
	public void add4() {

		System.out.println("add test");
}
	@Test(groups= {"system"})
	public void add5() {

		System.out.println("add test");
}
}