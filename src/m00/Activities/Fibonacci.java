package m00.Activities;

import java.math.BigInteger;
import java.util.ArrayList;

public final class Fibonacci {
	/**
	 * Calculates Fibonacci series as F[n] = F[n-1] + F[n-2] 
	 * with F[0] = 0, F[1] = 1
	 * @param n - number of Fibonacci series elements needs to be returned
	 * @return list of all numbers (starting from first)
	 */
	
	public static ArrayList<BigInteger> getSeries(int n){//getSeries veicina Understandable
		
		ArrayList<BigInteger> fibseries = new ArrayList<BigInteger>();
		
		if(n >0){
			fibseries.add(BigInteger.valueOf(0));
		}
		if(n > 1){
			fibseries.add(BigInteger.valueOf(1));
			for(int i = 2; i < n; i++){
				fibseries.add(fibseries.get(i-1).add(fibseries.get(i-2)));
			}
		}		
		return fibseries; 
	}
}
