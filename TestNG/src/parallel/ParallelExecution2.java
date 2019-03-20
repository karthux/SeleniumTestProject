package parallel;

import org.testng.annotations.Test;

public class ParallelExecution2 {

	@Test
	public void test21() {
		System.out.println("Executing test21");
		System.out.println("Thread ID" + Thread.currentThread().getId());
	}
	@Test
	public void test22() {
		System.out.println("Executing test22");
		System.out.println("Thread ID" + Thread.currentThread().getId());
	}
}
