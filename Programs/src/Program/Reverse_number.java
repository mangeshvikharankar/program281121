package Program;

public class Reverse_number 
{

	public static void main(String[] args) 
	{
		int given = 123;
		int remainder;
		int reverse=0;
		
		
		System.out.println("Given number is- " + given);
		
		while (given>0)
		{
			remainder = given%10;             // temp = 123%10=3,     12%10=2,     1%10=1
			given =given/10;             // given = 123/10= 12,  12/10=1,     1/10=0
			reverse = reverse *10 +remainder; // reverse = 3,         3*10+2=32,   32*10+1=321
			
		}
		System.out.println("Reverse number is- " + reverse);
	}

}
