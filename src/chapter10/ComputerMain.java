package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		
		int r = 10;
		
		//부모 = new 부모
		Calculator p1 = new Calculator();
		//부모 = new 자식
		Calculator p2 = new Computer();
		//자식 = new 자식
		Calculator c1 = new Calculator();
		//자식 = (자식)new 부모 -> 부모를 자식으로 캐스팅 할경우 이미 자식으로 new를 한상태여야한다. 
		//처음부터 new를 하는 경우는 안됨
		//Computer c2 = (Computer)new Calculator();
		
		p1.areaCircle(r);
		p2.areaCircle(r);
		c1.areaCircle(r);
		//c2.areaCircle(r);

	}

}
