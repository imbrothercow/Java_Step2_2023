package chapter09;

public class SuperMain {

	public static void main(String[] args) {
		
		Paprika obj = new Paprika();
		
		obj.set1("피망류", "여름", "노랑색"); //부모 클래스의 생성자를 사용
		obj.set2("빨강", 7000, "빨강파프리카"); //자식클래스의 생성자
		
		obj.disp1();
		obj.disp2();

	}

}
