package chapter10;

public class CalPlus extends CalculatorExam {

	//CalPlus클래스를 만들어 Calculator클래스를 상속받으세요.
	//오버라이딩을 이용하여 Calculator의 getResult()함수를
	//인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
	//물론 리턴값도 -1이면 안되겠죠??
	@Override
	public int getResult(int n1, int n2) {
		return n1 + n2;
	}

}
