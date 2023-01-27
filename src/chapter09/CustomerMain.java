package chapter09;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP고객
		System.out.println("--------VIP고객--------");
		int price = 10000;
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName() + "님이 " + vipprice + "원을 지불 완료하였습니다");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("--------일반고객--------");
		price = 10000;
		
		Customer cs = new Customer(1005, "김일반");
		int normalprice = cs.calcPrice(price);
		System.out.println(cs.getCustomerName() + "님이 " + normalprice + "원을 지불 완료하였습니다");
		System.out.println(cs.showCustomer());
		
	}

}
