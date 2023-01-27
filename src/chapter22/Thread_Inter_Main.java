package chapter22;

public class Thread_Inter_Main implements Runnable{

	public static void main(String[] args) {
		
		System.out.println("메인 클래스 시작!");
		
		Thread_Inter_Main t1 = new Thread_Inter_Main();
		//t1.run();
		Thread mThread = new Thread(t1); //일반 클래스의 객체를 스레드로 변환
		mThread.start();
		
		System.out.println("메인 클래스 종료!");
	}

	@Override
	public void run() {		
		System.out.println("run() 메소드 수행!");
		first();		
	}

	private void first() {
		System.out.println("first() 메소드 수행!");
		second();
	}

	private void second() {
		System.out.println("second() 메소드 수행!");
	}

}

/* 
	//일반적인 메소드 수행
	메인 클래스 시작!
	run() 메소드 수행!
	first() 메소드 수행!
	second() 메소드 수행!
	메인 클래스 종료!
	//스레드화된 클래스
	메인 클래스 시작!
	메인 클래스 종료!
	run() 메소드 수행!
	first() 메소드 수행!
	second() 메소드 수행!
*/