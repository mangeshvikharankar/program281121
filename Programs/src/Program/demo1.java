package Program;

import java.util.Scanner;

public class demo1 
{

	public static void main(String[] args) 
	{
		String a ="interview";
		char result;
		char[] b = a.toCharArray();
		for (int i=0; i<b.length;i++)
		{
			if (b[i]=='e')
			{
				result =b[i];
				System.out.println(result);
			}
			
		}
		for (int i=0; i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		

	}

}
