import java.util.ArrayList;
public class iteratorexample {
	
	public static void main(String [] args){
         Student s1= new Student(101, "shyam",12);
         Student s2= new Student(102, "varun",12);
         Student s3= new Student(103, "ram",12);
         
         ArrayList<Student> al = new ArrayList<Student> ();
         
	}

}
public class Student{
	int rollno;
	String name;
	int age;
	public Student(int r, String n, int a)
	{
		this.rollno = r;
		this.name = n;
		this.age = a;
	}
	
}
