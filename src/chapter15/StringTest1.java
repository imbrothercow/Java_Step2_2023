package chapter15;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		String javaStr = new String("java "); //heap
		String androidStr = new String(" androidStr"); //heap
		System.out.println(javaStr); //toString
		System.out.println(javaStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(javaStr)); //16진수
		
		System.out.println(androidStr); //toString
		System.out.println(androidStr.hashCode()); //10진수
		System.out.println(System.identityHashCode(androidStr)); //16진수
		
	}

}
