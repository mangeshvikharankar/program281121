package Program;

public class prime2 
{

	public static void main(String[] args) 
	{
		int n1 = 1;
		int n2 = 100;
		
		
		for (int i =n1; n1<=n2; n1++)
		{
			int temp =0;
			for (int j=2; j<n1; j++)
			{
				if (n1%j==0)
				{
					temp=temp+1;
				}
			}
			if (temp==0)
			{
			System.out.println(n1);
			}
		}
			
	
	}

}
