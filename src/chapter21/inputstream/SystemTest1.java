package chapter21.inputstream;

import java.io.IOException;

public class SystemTest1 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		try {
			int i = System.in.read();
			System.out.println(i); //아스키 코드
			System.out.println((char)i); //문자
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
