package TestTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1Test {
	
		@AfterTest
		public void Lastexecution()
		{
		System.out.println("I Will Execute last");			
		}
		
		@Test
		public void Demo()
		{
			
		System.out.println("Hello");
		Assert.assertTrue(false);
		}
		@AfterSuite
		public void Afsuit()
		{
			System.out.println("I am no 1 from last");
		}
		@Test
		public void Secondtest()
		{
			System.out.println("Bye");
		}

	}


