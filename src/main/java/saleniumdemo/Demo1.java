package saleniumdemo;


import org.testng.annotations.Test;

public class Demo1 {

	@Test(enabled=true)
	public void home2() {
		System.out.println("at after home 2");
	}
	
	@Test(enabled=true)
	public void logout() {
		System.out.println("at after class");
	}
	
}
