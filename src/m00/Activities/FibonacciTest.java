package m00.Activities;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Test;


public class FibonacciTest {

	@Test
	public void testgetSeriesCase1() {
		int testn1 = 4;
		
		BigInteger teste1[] = new BigInteger[]{ new BigInteger("0"), new BigInteger("1"), new BigInteger("1"), new BigInteger("2"),};
		ArrayList<BigInteger> result = Fibonacci.getSeries(testn1);
		BigInteger testr1[] = result.toArray(new BigInteger[result.size()]);
		assertArrayEquals(teste1, testr1);
	}

	@Test
	public void testgetSeriesCase2() {
		int testn2 = -3;
		
		ArrayList<BigInteger> testr2 = Fibonacci.getSeries(testn2);
		assertNotNull(testr2);
		assertEquals(testr2.size(), 0);
	}
	
	@Test
	public void testgetSeriesCase3() {
		int testn3 = 51;
		
		ArrayList<BigInteger> testr3 = Fibonacci.getSeries(testn3);
		assertEquals(testr3.size(), testn3);
		assertTrue(testr3.get(testr3.size()-1).toString().equalsIgnoreCase("12586269025"));
	}
	
	@Test
	public void testgetSeriesCase4() {
		int testn4 = 0;
		
		ArrayList<BigInteger> testr4 = Fibonacci.getSeries(testn4);
		assertNotNull(testr4);
		assertEquals(testr4.size(), 0);
	}
	
	@Test
	public void testgetSeriesCase5() {
		int testn5 = 1;
		
		ArrayList<BigInteger> testr5 = Fibonacci.getSeries(testn5);
		assertEquals("Testing test case 5. n = 1, series must be [0]", testr5.size(), testn5);
		assertEquals(testr5.get(0).intValue(), 0);
	}
}
