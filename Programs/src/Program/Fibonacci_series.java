package Program;

public class Fibonacci_series 
{
	//The Fibonacci series is a series where the next term is the sum of the previous two terms. The first two terms of the Fibonacci sequence are 0 followed by 1.

    //Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

	public static void main(String[] args) 
	{
		int a= 0;
		int b= 1;
		int n =10;
		int c;
		
		for (int i =1; i<=n; i++)
		{
			c= a + b;                     // 0+1=0,   1+1=2,  1+2=3,  2+3=5, 3+5 =8...
			System.out.print( a + ", ");   // 0 1 1 2 3...

			a = b;                       //0 = 1,    1 = 1,   1 = 2, 2 = 3...
			b = c;                       //1 = 1,    1 = 2,   2 = 3,  3 = 5...
			
		}
				

	}

}
