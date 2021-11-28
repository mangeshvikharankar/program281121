package Program;

import java.util.Scanner;
public class Largest_number_from_two_number  
{

	public static void main (String[]args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println (" Enter First number");
		int First_number = s.nextInt();
		System.out.println (" Enter Second number");
		int Second_number = s.nextInt();
			
		if (First_number>Second_number)
		{
			
			System.out.println(First_number+" is greater then "+ Second_number);
		}
		else
		{
			System.out.println(Second_number+" is greater then "+First_number);
		}
	}

}
