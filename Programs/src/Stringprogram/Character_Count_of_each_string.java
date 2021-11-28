package Stringprogram;

public class Character_Count_of_each_string 
{

	public static void main(String[] args) 
	{
		String main = "Hello world";
		int count = 0;
		System.out.println("The entered string is: "+ main);
		
		for (int i = 0; i < main.length(); i++)
		{
			
		//  if (main.charAt(i) == 'l')    // for counting single character
			if (main.charAt(i) != ' ')     //... for counting all character
			  count++;
		    
		}
		System.out.println("Total number in given string is "+ count);
	}


}


              