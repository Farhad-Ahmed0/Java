import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		Rectangle r1= new Rectangle();
		r1.setLength(12);
		r1.setWidth(10);
		
		Triangle t1=new Triangle();
		t1.setHeight(20);
		t1.setBase(10);
		
		Circle c1=new Circle();
		c1.setRadius(8);
		
		Square s1=new Square();
		s1.setSide(13);
		
		System.out.println("Area of Rectangle:"+ r1.calculateAreaofRectangle());
		System.out.println("Area of Triangle: "+ t1.calculateAreaofTriangle());
		System.out.println("Area of Circle: "+ c1.calculateAreaofCircle());
		System.out.println("Area of Square:"+ s1.calculateAreaofSquare());
		
	}
}