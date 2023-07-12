class Box
{
	int l;
	int b;
	int h;
	Box(int x,int y, int z)
	{
		l = x;
		b = y;
		h = z;
	}
	void printVolume()
	{
		int volume = l * b * h;
		System.out.println("Volume of the Box is : " + volume);
	}

	int fetchSurfaceArea()
	{
		int surfaceArea = 2 * (l * b + b * h + l * h);
		System.out.println("Area Returned to caller");
		return surfaceArea;
	}
	void setBoxSize(int x,int y,int z)
	{
		l = x;
		b = y;
		h = z;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Box b = new Box(5,5,5);
		System.out.println("Length of Box : " + b.l);
		System.out.println("Breadth of Box : " + b.b);
		System.out.println("Height of Box : " + b.h);
	}
}