package Program;

public class New 
{

	public static void main(String[] args) {
		
		String str = "Mangesh vikharankar";
		str = str.replaceAll("\\s","");
		String rev = "";
		for(int i = str.length()-1; i>=0;i--)
		{
		rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
