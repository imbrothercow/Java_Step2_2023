package chapter08;

public class Student1Main2 {

	public static void main(String[] args) {
		
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이재민");
		System.out.println("이름 : " + studentLee.studentName + "\nID : " + studentLee.studentID);
		//System.out.println(studentLee.getSerialNum());
		System.out.println(Student2.getSerialNum());
		Student2.serialNum++; // 10001
		
		Student2 studentKim = new Student2();
		studentKim.setStudentName("김창우");
		System.out.println("이름 : " + studentKim.studentName + "\nID : " + studentKim.studentID);
		System.out.println(Student2.getSerialNum());
		Student2.serialNum++; // 10002

		Student2 studentPark = new Student2();
		studentPark.setStudentName("박창훈");
		System.out.println("이름 : " + studentPark.studentName + "\nID : " + studentPark.studentID);
		System.out.println(Student2.getSerialNum());
		Student2.serialNum++; // 10003
		
	}

}
