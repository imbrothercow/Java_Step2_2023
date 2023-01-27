package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		System.out.println("----------Buy----------");
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println("----------Sell----------");
		Sell seller = customer;
		seller.sell();
		seller.sellorder();
		//seller.order();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			System.out.println("--Down Casting--");
			customer2.buy();
			customer2.sell();
			customer2.sellorder();
		}
		
		customer.order();

	}

}
