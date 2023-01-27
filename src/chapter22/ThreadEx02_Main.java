package chapter22;

public class ThreadEx02_Main {

	public static void main(String[] args) {
		
		ThreadEx02 t = new ThreadEx02(); //1~10까지의 요소가 temp변수방에 초기화 됨
		t.start(); //start() 메소드를 수행하면 내부에 run() 메소드가 수행된다			
		
		try {
			Thread.sleep(2000); //2초대기
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
