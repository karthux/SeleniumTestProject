package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Booking {
	@BeforeClass
	public void BfrClass() {
		
	}
	@Test
	public void ValidBooking() {
		System.out.println("valid booking");
	}
	
	@Test
	public void InvalidBooking() {
		System.out.println("invalid booking");
	}
}
