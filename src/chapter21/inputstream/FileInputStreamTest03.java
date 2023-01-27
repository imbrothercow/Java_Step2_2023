package chapter21.inputstream;

import java.io.FileInputStream;

public class FileInputStreamTest03 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10]; //버퍼로 활용
			
			int i;
			
			while((i = fis.read(bs)) != -1) {
				
				for(byte b : bs) {
					System.out.print((char)b + " ");
				} //10개 출력 완료
				System.out.println(" : " + i + "바이트 읽음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println();
		System.out.println("end");

	}

}
