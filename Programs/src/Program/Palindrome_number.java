package Program;

//Java Program to check the whether given number is a palindrome or not.

//A palindrome number is a number that is same after reverse. For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.

public class Palindrome_number
{
  public static void main(String[] args) 
  {    
	  int a = 1234;                  // given number
	  int temp = a;
	  int r;
	  int total = 0;
	  
	  while (a>0)
	  {
	  r = a % 10;             //1234%10= 4     123%10=3     12%10=2      1%10=1
	  a = a/10;              // 1234/10=123    123/10=12    12/10=1      1/10=0
	  total = total*10+ r;   // 4              4*10+3=43    43*10+2=432  432*10+1=4321
	  }
	  
	  
	  if (total == temp)
	  System.out.println(total +" is a palindrome number");
	  else
	 System.out.println(total +" is a not an palindrome number");  
	 
	  
  }    
}