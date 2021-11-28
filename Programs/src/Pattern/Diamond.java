package Pattern;

//For pyramid
//   * 
//  * * 
// * * * 
//* * * * 
// * * * 
//  * * 
//   * 
public class Diamond 
{

	public static void main(String[] args) 
	{
		for (int i =1; i<=4; i++)
		{
			for (int j=3; j>=i; j--)      // space decrement
			{
				System.out.print(" ");		
			}
			
			for (int k=1; k<=i; k++)     // star increment
			{
				System.out.print("* ");
			}
			System.out.println();	
		}
		
		 for (int i =1; i<=3; i++)
		 {
			 
			 for (int j=1; j<=i; j++)    // space increment
			 {
				 System.out.print(" ");
			 }
			 
			  for (int k=3; k>=i; k--)   // star decrement
			  {
				  System.out.print("* ");
			  }
			  System.out.println();
		 }
		

	}

}
