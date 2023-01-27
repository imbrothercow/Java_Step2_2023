package chapter20;

public class AutoCloseTest2 {


	public static void main(String[] args) {
		
		//자바 9부터 try~catch문 밖에서 선언 가능
		AutoCloseObj obj = new AutoCloseObj();
		
		try(obj){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분입니다");
		}

	}

}
