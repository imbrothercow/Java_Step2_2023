package chapter21.inputstream;

import java.io.IOException;

public class SystemTest2 {

	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");
		
		int i;
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println(i); //아스키 코드
				System.out.println((char)i); //문자
			}
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
