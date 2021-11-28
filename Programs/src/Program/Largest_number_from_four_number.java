package Program;
import java.util.Scanner;

public class Largest_number_from_four_number 
{

	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		int First_number = s.nextInt();
		System.out.println("Enter Second Number");
		int Second_number = s.nextInt();
		System.out.println("Enter Third Number");
		int Third_number =s.nextInt();
		System.out.println ("Enter Fourth Number");
		int Fourth_number =s.nextInt();
		
		
		if (First_number>Second_number)
		{
			if ( First_number>Third_number)
				
				 if ( First_number>Fourth_number)
				 {
					System.out.println(First_number+" is greater then "+ Second_number + ","+ Third_number +"," +Fourth_number );
				 }
				 else
				 {
					System.out.println(Fourth_number+" is greater then "+ First_number + ","+ Second_number +"," +Third_number );
				 }
			else
			 {
				System.out.println(Third_number+" is greater then "+ First_number + ","+ Second_number +"," +Fourth_number );
			 }
						
		}
		else
		{
			if (Second_number>Third_number)
			{
				if (Second_number>Fourth_number)
				{
					System.out.println(Second_number+" is greater then "+ First_number + ","+ Third_number +"," +Fourth_number );
				}
				else 
				{
					System.out.println(Fourth_number+" is greater then "+ First_number + ","+ Second_number +"," +Third_number );
				}
			}
			else
			{
				if (Third_number>Fourth_number)
				
				System.out.println(Third_number+" is greater then "+ First_number + ","+ Second_number +"," +Fourth_number );
				
				else 
				{
					System.out.println(Fourth_number+" is greater then "+ First_number + ","+ Second_number +"," +Third_number );
				}
			}
			 
			
		}
	}
}
