package Day21;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeMethod
	void BeforeM() {
		
		System.out.println("Before Every Method...");
	}
	@AfterMethod
	void AfterM() {
		System.out.println("After Every Method....");
	}
	@Test(priority=1)
	void Testm1() {
		System.out.println("Test Method 1.");
	}
	@Test(priority=2)
	void Testm2() {
		System.out.println("Test Method 2..");
	}
	@BeforeClass
	void BeforeC() {
		System.out.println("Before Class ....");
	}
	@AfterClass()
	void AfterC() {
		System.out.println("After Class....");
	}
	@BeforeTest
	void BeforeT() {
		System.out.println("Before Every Test....");
	}
	@AfterTest
	void AfterT() {
		System.out.println("After Every test....");
	}
	@BeforeSuite
	void BeforeS() {
		System.out.println("Before Suite");
	}
	@AfterSuite
	void AfterS()
	{
		System.out.println("After Suite");
	}

}
