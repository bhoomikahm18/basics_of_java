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

class MultipleBox
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		b1.printVolume();
		int boxSurfaceArea = b1.fetchSurfaceArea();
		System.out.println("Surface area of Box b1 : " + boxSurfaceArea);
		System.out.println("----------------------------");


		Box b2 = new Box();
		System.out.println("Length of Box b2 = " + b2.l);
		System.out.println("Breadth of Box b2 = " + b2.b);
		System.out.println("Height of Box b2 = " + b2.h);
		b2.l = 10;
		b2.b = 20;
		b2.h = 30;
		System.out.println("Length of Box b2 = " + b2.l);
		System.out.println("Breadth of Box b2 = " + b2.b);
		System.out.println("Height of Box b2 = " + b2.h);
		System.out.println("----------------------------");

		Box b3 = new Box();
		b3.printVolume();
		int boxSurface = b3.fetchSurfaceArea();
		System.out.println("Surface area of Box b3 : " + boxSurfaceArea);
		b3.l = 25;
		b3.b = 35;
		b3.h = 45;
		System.out.println("Length of Box b3 = " + b3.l);
		System.out.println("Breadth of Box b3 = " + b3.b);
		System.out.println("Height of Box b3 = " + b3.h);
		b3.printVolume();
		int boxSa = b3.fetchSurfaceArea();
		System.out.println("Surface area of Box b3 : " + boxSurfaceArea);

	}
}