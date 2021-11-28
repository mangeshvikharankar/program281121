package Program;

public class Armstrong_Number 
{
  //	For a given 3 digit number, find whether it is armstrong number or not.:-
	public static void main(String[] args) 
	{
		int a =153;   // given number   ....1634/153
		int temp = a;  // temporary variable
		int b ;
		int total =0;
		
		while (a>0)
		{
		b= a %10;                     // 153%10=3 ,     15%10=5,           1%10=1
		a = a/10;                    // 153/10=15 ,     15/10=1,           1/10=0
		total = total + b * b * b;  // 0= 0+ 3*3*3=27,  152= 27+ (5*5*5),  153= 27+125+ (1*1*1)
		}
		
		if ( temp ==total)
		
			System.out.print(temp +" is an armstrong number");
		
		else
			
			System.out.println(temp +" is not an armstrong number");
		System.out.println(total);	System.out.println(a);
	}

}
