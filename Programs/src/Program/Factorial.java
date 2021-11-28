package Program;

public class Factorial 
{
	//Program to find factorial of number
    //Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!
	//eg. 5! = 5*4*3*2*1 = 120  
	public static void main(String[] args) 
	{
		int given = 5;
		int fact = 1;
		for (int i=1; i<=given; i++)
		{
			fact= fact*i;           // 1*1=1,  1*2=2, 2*3=6, 6*4=24, 24*5=120
		}
      System.out.println(fact);
	}

}
