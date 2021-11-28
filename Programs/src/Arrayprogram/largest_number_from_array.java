package Arrayprogram;

public class largest_number_from_array 
{

	public static void main(String[] args) 
	{
		int a [] = { 100, 20, 456, 1230};
		int max = a[0];  
		System.out.println(max);
	    for (int i=1; i<a.length; i++)
	    {
	    	if ( a [i] > max)      
	    	{
	    		max = a[i];    
	    	}
	   
	    }
	 	System.out.println(max);
	}

}
