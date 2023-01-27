package chapter12.Interface;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		Calc calc = new CompleteCalc2();
		
		System.out.println("---default method---");
		calc.description(); //디폴트 메소드 호출
		System.out.println();
		
		System.out.println("---static method---");
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("1 ~ 5까지의 합 : " + Calc.total(arr));
		System.out.println();
		
		System.out.println("---interface method---");
		System.out.println("num1 + num2 : " + calc.add(num1, num2));
		System.out.println("num1 - num2 : " + calc.substract(num1, num2));
		System.out.println("num1 * num2 : " + calc.times(num1, num2));
		System.out.println("num1 / num2 : " + calc.divide(num1, num2));
		System.out.println();
		
		System.out.println("---child method---");
		((CompleteCalc2)calc).showInfo();

	}

}
