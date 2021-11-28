package Arrayprogram;

import java.util.Arrays;

public class sort_array_in_descending 
{

	public static void main(String[] args) 
	{
		int given [] = { 1,3,5,7,8};
		System.out.println("before sorting");
		for (int i=0; i<=given.length-1; i++)
		{
			System.out.println(given[i]);
		}
		System.out.println("after sorting");
		Arrays.sort(given);
		for (int i=given.length-1; i>=0; i--)
		{
			System.out.println(given[i]);
		}
		
	
	}

}
