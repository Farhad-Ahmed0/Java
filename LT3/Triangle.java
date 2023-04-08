import java.lang.*;
public class Triangle
{
	
	private double height;
	private double base;
	
	public Triangle()
	{
		System.out.println("Empty-Triangle");
	}
	public void setHeight(double height)
	{
		this.height=height;
	}
	public void setBase(double base)
	{
		this.base=base;
	}
	public double getHeight()
	{
		return height;
	}
	public double getBase()
	{
		return base;
	}
	public double calculateAreaofTriangle()
	{
		return 0.5*height*base;
	}
}