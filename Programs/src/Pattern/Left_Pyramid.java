package Pattern;
//Left pyramid Second and & Third quadrant

//    *
//   **
//  ***
// ****
//*****
// ****
//  ***
//   **
//    *

public class Left_Pyramid 
{
	public static void main (String []args)
	{
		for (int i=1; i<=5; i++)
		{
			for (int j=4; j>=i; j--)   // for space decrement
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)   // for star increment
			{
				System.out.print("*");
			}
			
			System.out.println();
		}	
		
		for (int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)    // for space increment
			{
				System.out.print(" ");
			}
			for (int k=4; k>=i; k--)
			{
				System.out.print("*"); // for star decrement
			}
			System.out.println();
		}
	}
}

