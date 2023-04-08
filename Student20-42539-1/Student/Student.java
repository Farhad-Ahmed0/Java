import java.lang.*;
public class Student
{
	private int id;
	private String name;
	private double cgpa;
	
	public void setId(int i)
	{
		id=i;
	}
	public void setName(String n)
	{
		name=n;
	}
	public void setCgpa(double c)
	{
		cgpa=c;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getCgpa()
	{
		return cgpa;
	}
	public static void main(String []args)
	{
		Student s1 = new Student();
		s1.setId(20425391);
		s1.setName("Farhad Ahmed");
		s1.setCgpa(3.70);
		
		System.out.println("Id is:"+s1.getId());
		System.out.println("Student Name:"+s1.getName());
		System.out.println("Cgpa:"+s1.getCgpa());
	}
}