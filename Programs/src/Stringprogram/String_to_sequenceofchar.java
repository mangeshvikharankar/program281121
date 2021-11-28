package Stringprogram;
import java.util.Arrays;

public class String_to_sequenceofchar 
{

	public static void main(String[] args) 
	{
	
		String a = "mangesh vikharankar";
		
		// convert given string into sequence of character by using tochararray method.
		
	    char array[]=a.toCharArray(); 
	    
	    for (char stringchar : array)
	    {
	    	 System.out.println(stringchar);
	    }
	    
	    
	    for (int i =0; i<array.length; i++)
    		    
	    {
	       System.out.print(array[i]);
	    }
	    
		   System.out.println("========"); 
	    
	    //convert given string into sequence of character by using charat method
	    
			String b = "velocity class";
			
		   for ( int i=0; i< b.length() ; i++)
		   {
			   System.out.println(b.charAt(i)); 
			   
		   }
		   
	   
	}

}
