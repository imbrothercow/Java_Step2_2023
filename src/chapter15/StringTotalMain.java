package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class StringTotalMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
		
		//================================================
		//String 클래스의 정보 가져오기
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		//String 클래스의 생성자들 가져오기
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("------------------------------");
		
		Field[] field = strClass.getDeclaredFields();
		for(Field f : field) {
			System.out.println(f);
		}
		
		System.out.println("------------------------------");
		
		Method[] method = strClass.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		
		//================================================
		String str = "Have,a,Nice,Day";
		
		//Tokenizer
		StringTokenizer obj = new StringTokenizer(str, ",", false);
		
		while(obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
		
		
		
	}

}
