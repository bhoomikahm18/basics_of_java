class elseif
{
	public static void main(String [] args)
	{
		int p = 5;
		
		if(p == 0)
		{
			System.out.println("value of p = 0");
		}
		else if(p == 1)
		{
			System.out.println("value of p = 1");

		}
		else if(p == 2)
		{
			System.out.println("value of p = 2");
		}
		else
		{
			System.out.println("value of p is not 0,1,2");
		}
		System.out.println("Out of statement");
	}
}