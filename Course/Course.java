import java.lang.*;
public class Course{
	
	private String courseCode;
	private String courseName;
	private int credit;
	private String courseType;
	
	public Course()
	{
		System.out.println("Empty Course");
	}
	public Course(String courseCode, String courseName, int credit, String courseType){
		System.out.println("Parameterized Course");
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.credit = credit;
		this.courseType=courseType;
	}
	public void setCourseCode(String courseCode){
		this.courseCode = courseCode;
	}
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	public void setCredit(int credit){
		this.credit =credit;
	}
	public void setCourseType(String courseType){
		this.courseType=courseType;
	}
	public String getCourseCode( ){
		return courseCode;
	}
	public String getCourseName( ){
		return courseName;
	}
	public int getCredit( ){
		return credit;
	}
	public String getCourseType( ){
		return courseType;
	}
	public void showDetails( ){
		System.out.println("Course Code is: "+courseCode);
		System.out.println("Course Name is: "+courseName);
		System.out.println("Credit is: "+credit);
		System.out.println("Course Type:"+courseType);
	}
	
}