package Arrayprogram;

import java.util.Arrays;


public class Check_array_equal 
{

	public static void main(String[] args) 
	{
		int a [] = {10, 20, 40};
		int b []= {30, 40, 50};
		int c []= {30, 40, 50};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(c, b));
		System.out.println(Arrays.equals(a, c));
		
		
		}

	}


