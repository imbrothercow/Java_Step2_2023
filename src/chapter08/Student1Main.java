package chapter08;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이재민");
		studentLee.studentID = studentLee.serialNum;
		System.out.println("이름 : " + studentLee.studentName + "\nID : " + studentLee.studentID);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++; // 10001
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김창우");
		studentKim.studentID = studentKim.serialNum;
		System.out.println("이름 : " + studentKim.studentName + "\nID : " + studentKim.studentID);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++; // 10002

		Student1 studentPark = new Student1();
		studentPark.setStudentName("박창훈");
		studentPark.studentID = studentPark.serialNum;
		System.out.println("이름 : " + studentPark.studentName + "\nID : " + studentPark.studentID);
		System.out.println(Student1.getSerialNum());
		Student1.serialNum++; // 10003
		
	}

}
