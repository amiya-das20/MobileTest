package TestTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3Test {
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("Before executing all method in the class");
	}
	
	@Parameters({"URL","APIKey/userName"})
	@Test
	public void Weblogincarloan(String urlname,String key)
	{
		//Selenium
		System.out.println("Weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("After executing all method in the class");
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	@AfterMethod
	public void Afterevery()
	{
		System.out.println("I will execute after every test method in day 3 class");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarloan()
	{
		//Appium
		System.out.println("Mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuit()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void MobilesigninCarloan()
	{
		//Appium
		System.out.println("Mobile SignIn");
	}
	//@Test(timeOut=4000)
	@Test(dataProvider="getdata")
	public void MobilesignoutCarloan(String username, String passsword)
	{
		//Appium
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(passsword);
	}
	@Test(dependsOnMethods= {"MobileloginCarloan"})
	public void LoginApicarloan()
	{
		// Rest API Automation
		System.out.println("APilogincar");
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		//1 combination username password for good credit card history
		//2 username password no credit history
		//3 fraudlent credit history
		
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="password";
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	}
	
}

