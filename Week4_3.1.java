abstract class AC
{
	abstract double Calculate();
}
class Square extends AC
{
	double s=4.0;
	double Calculate()
	{
		return (s*s);
	}
}
class rectangle extends AC
{
	double l=19.0;
	double w=8.0;
	double Calculate()
	{
		return (l*w);
	}
}
class triangle extends AC
{
	double h=10.0;
	double b=17.0;
	double Calculate()
	{
		return (0.5*b*h);
	}
}
class Abstract
{
	public static void main(String[] args)
	{
		Square s1 = new Square();
		rectangle r1 = new rectangle();
		triangle t1 = new triangle();
		System.out.println("area of square:" + (s1.Calculate()));
		System.out.println("area of rectangle:" + (r1.Calculate()));
		System.out.println("area of triangle:" + (t1.Calculate()));
	}
}
