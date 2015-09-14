


/* Problem Definition: Find the sum of the squares of the first 100 elements in the 
   fibonacci series which are divisible by 3.
 */

import java.math.BigInteger;

	/* 
	 Mathematically Fibonacci series is described by following sequence:
	 F(n) = F(n-1) + F(n-2), with values F(0)=0, F(1)=1
	 
	 and Integer sequence is:
	 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,...
	 */

public class Fibonacci {
		

	 /*
	 ComputeFibonacci is an Iterative method to compute fibonacci series
	 which passes parameter integer to define the range of fibonacci series 
	 and its return value is BigInteger so it can compute large number of fibonacci series without the
	 problem of Arithmatic overflow
	 */
	
	public static BigInteger ComputeFibonacci(int N) {
	
		  if (N == 1 || N == 2)   // value of F(1) and F(2) =1
		  {
		    return BigInteger.ONE;
		  }
		  
		  BigInteger PrevFibo = BigInteger.ONE;
		  BigInteger NextFibo = BigInteger.ONE;
		  BigInteger Fibo = BigInteger.ZERO;
		  
		  for (int i = 3; i <= N; i++)  // Calculate Fibonacci series of N numbers
		  { 
		      Fibo = PrevFibo.add(NextFibo);
		      PrevFibo = NextFibo;
		      NextFibo = Fibo;  
		  }
		  return Fibo;
	      }
		  
		  
	 public static void main(String[] args) {
         
		 BigInteger SumOfSquare = BigInteger.ZERO; // Initialize Answer(SumOfSquare) with ZERO
 
		 int count = 0;     // Initial count of fibonacci numbers which are divisible by 3
		 int N = 1;         // Starting number to generate fibonacci series and passed to ComputeFibonacci function
		 int range= 100;    // Range to find fibonacci numbers which are divisible by 3 (maximum of count)
		 
		 /* Following while loop iterates the first 100 fibonacci numbers divisible by 3,
		  	then comutes sum of squares of those 100 numbers
		  
		 
		  Big (O) complexity of Algorithm:
		   	This algorithm has complexity of O(N*N) because method ComputeFibonacci containing 
		  	for(N) loop goes through following while(N) loop.
		  */
		 while(count < range) { 
			 
			 if(ComputeFibonacci(N).mod(new BigInteger("3")).equals(BigInteger.ZERO)){
				 SumOfSquare= SumOfSquare.add(ComputeFibonacci(N).pow(2));
				 count++;
				 //System.out.println(count + " " + ComputeFibonacci(N) + " " + N);
			}
			 N++;
		 } 
		 // prints the sum of sqaure of first 100 fibonacci numbers divisible by 3
		 System.out.println(SumOfSquare);
	 }
	
}
	
