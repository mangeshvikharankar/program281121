package Stringprogram;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		String main = " Mangesh vikharankar";
		
		int length = main.length();
		
		String reverse = "";
		
		for (int i=length-1; i>0; i--)
		{
			reverse = reverse + main.charAt(i);
		}
		
		System.out.println(reverse);
	}

}
