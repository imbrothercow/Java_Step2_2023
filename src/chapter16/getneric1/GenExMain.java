package chapter16.getneric1;

public class GenExMain {

	public static void main(String[] args) {
		
		//사용자가 원하는 형태로 객체생성
		GenEx<String> v1 = new GenEx<String>();
		v1.setValue("100");
		
		System.out.println(v1.getValue());
		
		//정수, 실수, 문자
		
		GenEx<Object> vArr[] = new GenEx[3];
		for(int i=0; i<vArr.length; i++) {
			vArr[i] = new GenEx<>();
		}
		
		vArr[0].setValue(100);
		vArr[1].setValue(3.14);
		vArr[2].setValue('A');
		
		for(GenEx<Object> geo : vArr) {
			System.out.println(geo.getValue());
		}
		

	}

}
