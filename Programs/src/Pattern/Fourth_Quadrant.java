package Pattern;

public class Fourth_Quadrant
//*****
//****
//***
//**
//*

{

	public static void main(String[] args) 
	{
		for (int i =1; i<=5; i++)  // for rows
		{
			for (int j= 5; j>=i; j--)  //for columns
			{
				System.out.print("*");
			}
			System.out.println( );
		}


	}

}
