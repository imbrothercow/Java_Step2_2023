package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		//try ~ catch 문을 사용해야한다
		//fis = new FileInputStream("a.txt");
		
		try {
			fis = new FileInputStream("a.txt"); //open
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try { //close
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
			System.out.println("Finally");
		}
		System.out.println("end");
	}

}
