package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_07march {
	@BeforeMethod
	public void precondition() throws Exception {
		System.out.println("Open Chrome Browser");
		throw new Exception("browser not opening");
		//System.out.println("Open Facebook URL");
	}
		
	@Test(priority=1)
	public static void validlogin() {
		System.out.println("valid login");
		//throw new Exception("home page found");
		System.out.println("Expected Page");
	}
	@Test(priority=2)
	public static void InValidlogin() {
		System.out.println("valid login");
		System.out.println("Expected Page");
	}
	@Test(priority=4)
	public static void expiredlogin() {
		System.out.println("valid login");
		System.out.println("Expected Page");
	}
	@Test(priority=3)
	public static void emptylogin() {
		System.out.println("valid login");
		System.out.println("Expected Page");
	}
	@AfterMethod
	public void postCondition() {
		System.out.println("Browser Close");
	}
}
