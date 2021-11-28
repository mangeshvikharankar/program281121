package Arrayprogram;

public class Reverse_array 
{

	public static void main(String[] args) 
	{
		  int a [] = { 10, 100, 20, 30, 40};
		  
		  int start = 0;
		  int end = a.length-1;
		  int temp =0;
		  
		  while (start<end)
		  {
			  temp = a [start]; 
			  a [start] = a[end];   
			  a [end] = temp;     
			  start++;
			  end--;  
		  }
		  
		  for (int i =0; i<a.length; i++)
		  {
			System.out.println(a[i]);  
		  }
//		   for (int i: a)
//		   {
//				System.out.println(i);   
//		   }

	}

}
