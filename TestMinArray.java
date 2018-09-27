package lab04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMinArray {

	@Test
	public void MinArrayTest(){
		System.out.println("Begin minArrayTest: ");
		int[] arr1={4,6,88,3,1,56};
		int result1 = Main.minArray(arr1);
		assertEquals(1,result1);
		//
		int[] arr2={24,35,65,14,20,16,12,15,19};
		int result2 = Main.minArray(arr2);
		assertEquals("error",12,result2);
		//
		int[] arr3={34,56,123,456,14,256,876,43,22,125};
		int result3 = Main.minArray(arr3);
		assertEquals(14,result3);
		//
		int[] arr4={345,765,254,689,765,432,652,357,986,146,324,964,135,145,137,652};
		int result4 = Main.minArray(arr4);
		assertEquals(135,result4);
		//
		int[] arr5={1987,1356,2343,1567,3423,6767,4342,2314,5234,1222,2425,6547,3542
				   ,2425,6365,5574};
		int result5 = Main.minArray(arr5);
		assertEquals(1222,result5);
		//
		System.out.println("Finish!");
	}

}
