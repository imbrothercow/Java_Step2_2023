package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		StaticFunction st = new StaticFunction();
		System.out.println("static str2 : " + st.getStatic());
		
		//권장형, static 메소드는 클래스명으로 접근이 가능
		String str;
		str = StaticFunction.getStatic();
		System.out.println("static str2 : " + str);

	}

}
