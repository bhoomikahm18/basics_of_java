class breakstatement
{
	public static void main (String args[])
	{
		for(int i = 0; i < 5; i++)
		{
			if(i == 2)
			{
				break;
			}
			System.out.println("Hello World");
		}
		System.out.println("end of loop");
	}
}