package Arrayprogram;

public class prime_numbers_from_array 
{

	public static void main(String[] args) 
	{
		int a []= {2, 8, 7, 10,11, 12};
			
		for (int i=0; i<a.length; i++)
		{
			int temp=0;
			
			for (int j=2; j<a [i]; j++)
			{
				if (a[i]%j==0)
				{
					temp=temp+1;
				}
				
			}
			 if (temp==0)
				 {
				   System.out.println(a[i]);
				 
				 }
		}


	}

}
