package Arrayprogram;

public class sort_array_in_descending2 
{

	public static void main(String[] args) 
	{
		int a [] = { 10, 33, 48, 40, 6, 7 };
		int temp =0;
		int end = a.length-1;
		
		for (int i =0; i<=end; i++)
		{
			for (int j = i+1; j<=end; j++)
			{
				if (a[i]<a [j])
				{
					temp = a[i];
					a [i] = a[j];
					a [j]= temp;
			
				}
			}
		}
		
		for (int i =0; i<end; i++)
		{
			System.out.println(a [i]);
		}

	}

}
