package chapter11;

public abstract class Animal {
	
	public String kind;
	
	public void breadthe() {
		System.out.println("숨을 쉽니다");
	}
	
	//추상클래스의 추상메소드
	public abstract void sound();

}
