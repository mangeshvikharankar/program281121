package Arrayprogram;

public class dupilcate_string_from_array 
{
  // Program to find the duplicated numbers from array
	
	public static void main(String[] args) 
	{
		
		String str ="aaa aaa aab";
		String arr [] = str.split(" ");
	    
		for ( int i =0; i<=arr.length-1; i++)
		{
			int count =1;
			for  ( int j =i+1; j <=arr.length-1; j++)
			{
				if ((arr[i].equals(arr[j]) && i!=j))
				{
					count++;
					arr[j]=" ";
				}
			}
			if (count>1 && arr[i]!=" ")
			{
				System.out.println(arr[i] +" duplicate string found in array");
			}

		}
	}

}
