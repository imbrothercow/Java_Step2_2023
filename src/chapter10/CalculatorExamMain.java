package chapter10;

import java.util.Scanner;

public class CalculatorExamMain {

	public static void main(String[] args) {
		
		//Main에서 실행하여 아래와 같은 결과가 나오면 성공
		//CalPlus : 30
		//CalMinus : 15
		Scanner s = new Scanner(System.in);
		CalculatorExam[] calculators = {new CalPlus(), new CalMinus()};
		
		System.out.print("정수 A를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("정수 B를 입력하세요 : ");
		int b = s.nextInt();
		
		for(CalculatorExam ce : calculators) {
			System.out.println(ce.getClass().getSimpleName() + " : " + ce.getResult(a, b));
		}

	}

}
