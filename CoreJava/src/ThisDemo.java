class Student
{
	int rno;
	String sname;
	public Student() {
		System.out.println("Default Constructor Called");
	}
	public Student(int rno,String sname) {
		this();
		this.rno=rno;
		this.sname=sname;
	}
	void display()
	{
		System.out.println("Roll No : "+this.rno);
		System.out.println("Stduent Name : "+this.sname);
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Student s1=new Student(1, "Jigar");
		s1.display();
	}
}
