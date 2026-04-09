package Tenstngallprogram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case1_login_to_amazone {

	
		// TODO Auto-generated method stub
		
		@Test
		public void logintoamazon() throws Exception {
			ChromeDriver b= new ChromeDriver();
			b.get("https://www.amazon.in/");
			
			
			b.manage().window().maximize();
			Thread.sleep(2000);
			Assert.assertEquals(b.getTitle(), "Amazon.in: Online Shopping India - Buy mobiles, laptops, cameras, books, watches, apparel, shoes and e-Gift Cards. Free Shipping & Cash on Delivery Available.");
			
		}

	}


