package Program;

public class demo 
{
	public static void main(String[] args) {
		
		
		String s = "abc abcd abcd abcd";
	     String arr []=s.split("");
		 
	//	String arr[]= {"abc","pqr","abc"}; 
		int a =0;
		String duplicate = "abcd"; 
		 for(int i = 0;i<=arr.length-1;i++)
		 { for( int j = arr.length-1; j>=0; j--)
		 	{
			 	 
			    if(arr[i]==arr[j] && i!=j)
			    {
				 a++;
			    }    
		 	}
		 }
		 if(a >0)
		 	{	 
			 System.out.println("Duplicate string found in array");
		 	} 	 
		 else
		 	{
			 System.out.println("Duplicate string Not found in array");
		 	}
		 
//		System.out.println(s);
//		   for(int i = 0; i <= arr.length-1; i++)
//		   {System.out.print(arr[i]);}

}
}
