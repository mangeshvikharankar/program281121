package Stringprogram;

public class Remove_duplicate_character_from_string {

	public static void main (String args[])
	{
		String given = "aaabbbccc";
//		System.out.println(given.split(given));
		String result = "";
		for (int i=0; i<given.length();i++)
		{
			boolean found =false;

			for (int j=0; j<result.length();j++)
				{
					if (given.charAt(i) == result.charAt(j))
					{
						found = true;
						break;
					}	
				}
			if (found ==false)
			  {
				result = result +given.charAt(i);
			  }
		}
		System.out.println(result);	

	}

}
