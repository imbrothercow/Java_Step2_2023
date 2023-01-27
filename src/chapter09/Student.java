package chapter09;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); //오버로딩된 부모클래스의 생성자
		this.studentNo = studentNo;
	}

}
