package Program;

public class prime_number 
{
/// Program to check whether given no. is prime or not.
//The number which is only divisible by itself and 1 is known as prime number.
	public static void main(String[] args) 
	{
		int given = 7;
		int temp =0;                          // Temporary variable
		 for (int i =2;  i< given ; i++)
		 {
			if (given % i==0)             
			{
				temp = temp+1;
			}
			
		 }
		 
		 if (temp>0)
		 {
			 System.out.println(given +" is not a prime no.");
		 }
		 else
		 {
			 System.out.println(given +" is a prime no.");
		 }
		

	}

}
