package chapter09;

public class Berry extends Fruit {
	
	private String name;
	private String size;
	
	//setter
	public void set2(String a, String b) {
		name = a;
		size = b;
	}
	
	//getter
	public void disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + size);
	}
	
}
