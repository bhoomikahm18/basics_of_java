class Box
{
	int l = 5;
	int b = 5;
	int h = 5;

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
}

class Demo
{
	public static void main(String args[])
	{
		Box b = new Box();
		b.printVolume();
		int boxSurfaceArea = b.fetchSurfaceArea();
		System.out.println("Surface area of Box b : " + boxSurfaceArea);
		System.out.println("Length of Box b = " + b.l);
		System.out.println("Breadth of Box b = " + b.b);
		System.out.println("Height of Box b = " + b.h);
	}
}