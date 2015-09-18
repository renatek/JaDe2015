package m00;
import java.util.Scanner;

public class Test {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = 0;
		do{
	    System.out.println("Enter n value");
		n = in.nextInt();
		}
		while(n<=0);
		in.close();
		
		int fibonaci[] = new int[n+1];
		fibonaci[0] = 0;
		fibonaci[1] = 1;
		for (int i=2; i<n+1; i++) {
		  fibonaci[i] = fibonaci[i-1] + fibonaci[i-2];
		}
		
		for(int i=0; i<n+1; i++){
			System.out.print(fibonaci[i] + " ");
		}
		
	}
}
