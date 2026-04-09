package Testngbatch64;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Howtohandledependenttc {

	
		
	@Test
		public void add13() {
			
			Assert.assertEquals(false, true);
		}
		
		@Test(dependsOnMethods="add13")
		public void add2() {
			
			System.out.println("this is add tc3");
		}
		

	}


