package chapter16.getneric1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen = new Gen();
		
		//정수형
		Integer[] iArr = {1, 2, 3, 4, 5};
		
		//더블형
		Double[] dArr = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		//문자형
		Character[] cArr = {'A', 'B', 'C', 'D', 'E'};
		
		Object[] oArr[] = new Object[3][];
		oArr[0] = iArr;
		oArr[1] = dArr;
		oArr[2] = cArr;
		
		for(Object[] oa : oArr) {
			gen.printArr(oa);
		}
	}

}
