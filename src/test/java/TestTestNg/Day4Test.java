package TestTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4Test {
	@Parameters({"URL"})
	@Test
	public void Webloginhomeloan(String uname)
	{
		//Selenium
		System.out.println("Webloginhomepersonalloan");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void Mobileloginhomeloan()
	{
		//Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void LoginApihomeloan()
	{
		// Rest API Automation
		System.out.println("APiloginhome");
	}
	
}

