package parallel;

import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	public void test1() {
		System.out.println("Executing test1");
		System.out.println("Thread ID" + Thread.currentThread().getId());
	}
	@Test
	public void test2() {
		System.out.println("Executing test2");
		System.out.println("Thread ID" + Thread.currentThread().getId());
	}
}
