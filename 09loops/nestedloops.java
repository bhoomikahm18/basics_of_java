class nestedloops
{
	public static void main (String [] args)
	{
		System.out.println("##### Start of nested loops #####");
		for(int i = 0; i < 3; i++)
		{
			System.out.println("------Inside for loop------");

			int j = 3;
			while(j > 0)
			{
				if(i == j)
				{
					break;
				}
				System.out.println("*****Inside while loop*****");
				j--;
			}
			System.out.println("<---Outside while loop--->");

		}
		System.out.println("##### End of nested loops #####");
	}
}