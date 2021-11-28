package Program;
import java.util.Scanner;

public class Largest_number_from_three_number 
{

	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int First_number = s.nextInt();
		System.out.println("Enter Second Number");
		int Second_number = s.nextInt();
		System.out.println("Enter Third number");
		int Third_number =s.nextInt();
		
		
		if (First_number>Second_number)
		{
			if ( First_number>Third_number)
			{
				System.out.println(First_number+" is greater then "+ Second_number + "&"+ Third_number);
			}
			else
			{
				System.out.println(Third_number+" is greater then "+ First_number + "&"+ Second_number);
			}
			
			
		}
		else
		{
			if (Second_number>Third_number)
			{
				System.out.println(Second_number+" is greater then "+ First_number + "&"+ Third_number);
			}
			else 
			{
				System.out.println(Third_number+" is greater then "+ First_number + "&"+ Second_number);
			}
		}
	}
}
