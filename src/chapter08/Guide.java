package chapter08;

public class Guide {
	
	/*
	스테틱 변수 point를 가지는 Guide클래스를 만들고, 
	이름과 성별 정보를 갖는 Guest 클래스를 만들어 아래의 결과가 나오도록 하는 로직을 구현
	최초 실행시 등록할 관광객 수를 지정.
	지정한 수 만큼 Guest클래스의 배열로 만듬
	
	결과 : 

	관광객 수 : 2 (사용자가 입력)
	관광객 등록
	1. 이름 : 홍길동
	1. 성별 : 남
	--------------------------
	2. 이름 : 홍길순
	2. 성별 : 여
	
	1. 관광객 정보
	2. 목적지 변경
	3. 종료
	*/
	
	static String point;
	Guest[] guest;
	
	//생성자 초기화
	public Guide(int n) {
		point = "발리";
		guest = new Guest[n];
		
		//객체 생성
		for(int i=0; i<guest.length; i++) {
			guest[i] = new Guest();
		}
	}
	
}
