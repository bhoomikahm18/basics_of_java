class methodInvocation
{
	static int add(int a, int b)
	{
		int c = a + b;
		return c;
	}
	public static void main(String args[])
	{
		int result = add(55,65);
		System.out.println("Sum of 55 and 65 is : " + result);
		System.out.println("Sum is : " +(10 + 20)); //short cut to print output
	}
}