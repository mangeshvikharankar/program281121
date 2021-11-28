package Arrayprogram;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) 
	{
		int ar[] = {20,50,40,30,20};
		System.out.println("----before sorting----");
		
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}	
		System.out.println("----enhanced for loop----");
		for (int i:ar)
		{
			System.out.println(i);
		}
		
		Arrays.sort(ar);   //sorting
		System.out.println("----after sorting----");
		for (int i = 0; i <= ar.length-1; i++) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("----sorting by enhanced for loop----");
		
		for (int i : ar)
		{
			System.out.println(i);
		}
		
		System.out.println("----descending order ----");
		for (int i = ar.length-1; i>=0; i--) 
		{
			System.out.println(ar[i]);
		}
		System.out.println("----sorting by enhanced for loop descending order ----");
		
		
		
		
	
		int a [] = { 20, 30, 40, 50, 30};
		System.out.println("==before sorting==");
		for (int i =0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("==After sorting==");
		 for (int i =0; i<a.length-1; i++)
		 {
			System.out.println(a[i]); 
		 }
		
		

	}

}
