package Program;

public class a 
{
	public static void main (String[] args)
	{
		String a = "mangesh vikharankar123@";
		String b =a.replaceAll("[0-9]", "");
		String c =a.replaceAll("[a-z]", "");
		String d =a.replaceAll("[^a-z0-9]", "");
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
