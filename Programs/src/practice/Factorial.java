package practice;

public class Factorial
{
	public static void main(String[] args) 
	{
		int given = 153;
		int temp = given;
		int remainder;
		int total=0;
		
		while (given>=0)
		{
		remainder = given%10;    
		total = given/10;        
		total= given + remainder*remainder*remainder;   
		}
		if(total==temp)
		{
		System.out.println("Given number is armstrong number");
		}
		else
		{
		System.out.println("Given number is not an armstrong number");
		}
	}
	


}