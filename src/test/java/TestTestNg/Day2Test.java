package TestTestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2Test {
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}

}
