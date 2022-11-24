package testNgConcept;


import org.testng.annotations.*;

public class TestNGDemo {
	
	@BeforeGroups(groups="abc")
	public void beforeGroupMethod(){
		System.out.println("In 1. beforeGroupMethod");
	}
	
	@BeforeSuite
	public void beforeSuiteMethod(){
		System.out.println("In 2. beforeSuiteMethod");
	}	
	
	@BeforeTest
	public void beforeTestMethod(){
		System.out.println("In 3. beforeTestMethod");
	}
	
	@BeforeClass
	public void beforeClassMethod(){
		System.out.println("In 4. beforeClassMethod");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("In 5. beforeMethod");
	}
	
	@Test(groups={"abc"}, priority = 1)
	public void test1(){
		System.out.println("In test1");
	}
	
	@Test(priority=1)
	public void test2(){
		System.out.println("In test2");
	}
	
	@Test(groups={"abc"}, priority = 2)
	public void test3(){
		System.out.println("In test3");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("In 11. afterMethod");
	}

	@AfterGroups(groups="abc")
	public void afterGroupMethod(){
		System.out.println("In 12. afterGroupMethod");
	}
	
	@AfterSuite
	public void afterSuiteMethod(){
		System.out.println("In 13. afterSuiteMethod");
	}	
	
	@AfterTest
	public void afterTestMethod(){
		System.out.println("In 14. afterTestMethod");
	}
	
	@AfterClass
	public void afterClassMethod(){
		System.out.println("In 15. afterClassMethod");
	}
}
