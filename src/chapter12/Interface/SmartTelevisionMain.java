package chapter12.Interface;

public class SmartTelevisionMain {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolume(10);
		tv.search("www.naver.com");
		tv.turnOff();
		System.out.println("------------------");
		
		//Remote 클래스에 정의되어있는 메소드만 오버라이딩된 메소드 대입
		Remote rc = tv;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		((Searchable)rc).search("www.naver.com");
		System.out.println("------------------");

		Searchable sc = tv;
		((Remote)sc).turnOn();
		((Remote)sc).setVolume(-7);
		((Remote)sc).turnOff();
		sc.search("www.naver.com");
		
	}

}
