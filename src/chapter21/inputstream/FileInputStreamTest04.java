package chapter21.inputstream;

import java.io.FileInputStream;

public class FileInputStreamTest04 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10]; //버퍼로 활용
			
			int i;
			
			while((i = fis.read(bs)) != -1) {
				
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j] + " ");
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
