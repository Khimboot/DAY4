package day4;

import static org.junit.Assert.*;

import org.junit.Test;

public class day4_test {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		Main aw = new Main();
		
		System.out.println("Input 1 then count...");
		aw.toCount(1);
		System.out.println("Input 2 then count...");
		aw.toCount(2);
		System.out.println("Input 3 then count..."); 
		aw.toCount(3);
		System.out.println("Input 4 then count...");
		aw.toCount(4);
		System.out.println("Input 5 then count...");
		aw.toCount(5);
		System.out.println("Input 6 then count...");
		aw.toCount(6);
		System.out.println("Input 7 then count...");
		aw.toCount(7);
		System.out.println("Input 8 then count...");
		aw.toCount(8);
		System.out.println("Input 9 then count...");
		aw.toCount(9);
		System.out.println("Input 0 then No count...");
		aw.toCount(0);
		System.out.println("Input 10 then No count...");
		aw.toCount(10);
		
	}

}
