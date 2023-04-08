import java.lang.*;
public class Start
{
	public static void main(String args[]){
		Course c1= new Course();
		c1.setCourseCode("1204");
		c1.setCourseName("java");
		c1.setCredit(4);
		c1.setCourseType("online");
		
		System.out.println("Course Code is: "+c1.getCourseCode());
		System.out.println("Course Name is: "+c1.getCourseName());
		System.out.println("Credit is: "+c1.getCredit());
		System.out.println("Course Type:"+c1.getCourseType());
		
		Course c2=new Course("1205","Discrete Math",3,"online");
		c2.showDetails();
	}
}