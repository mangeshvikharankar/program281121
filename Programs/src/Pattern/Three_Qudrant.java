package Pattern;

public class Three_Qudrant 

//****
// ***
//  **
//   *


//For pyramid
// * * * * 
//  * * * 
//   * * 
//    * 


{

	public static void main(String[] args) 
	{
		for (int i=1; i<=4; i++)  // for rows
		{
			for (int j=1;  j<i; j++) // for spaces
			{
				System.out.print(" ");
				
			}
			for (int k=4 ; k>=i; k--)  // for star
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
