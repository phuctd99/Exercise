package lab04;

import static org.junit.Assert.*;
public class TestBigger  {
	@org.junit.Test
	public void biggerTest() {
		System.out.println("begin biggerTest: ");
		//
		int result1 = Main.bigger(3,5);
		assertEquals(5,result1);
		//
		int result2 = Main.bigger(14,35);
		assertEquals(35,result2);
		//
		int result3 = Main.bigger(24,6);
		assertEquals(24,result3);
		//
		int result4 = Main.bigger(34,46);
		assertEquals(46,result4);
		//
		int result5 = Main.bigger(12,23);
		assertEquals(23,result5);
		//
		System.out.println("Finish!");
	}
}
