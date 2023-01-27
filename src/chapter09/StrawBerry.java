package chapter09;

public class StrawBerry extends Berry {
	
	private String color;
	private int price;
	
	//setter
	public void set3(String a, int b) {
		color = a;
		price = b;
	}
	
	//getter
	public void disp3() {
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
	}

}
