package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		
		//X, Y, MyInterface 클래스 타입의 변수를 선언하여 출력
		
		X x = new MyClass();
		x.x();
		((Y)x).y();
		((MyInterface)x).myMethod();
		
		Y y = new MyClass();
		((X)y).x();
		y.y();
		((MyInterface)y).myMethod();
				
		MyInterface mi = new MyClass();
		((X)mi).x();
		((Y)mi).y();
		mi.myMethod();
		
		MyClass mClass = new MyClass();
		mClass.x();
		mClass.y();
		mClass.myMethod();

	}

}
