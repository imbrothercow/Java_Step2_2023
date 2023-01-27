package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Vehicle[] vArr = {new Bus(), new Taxi()};
		
		for(Vehicle v : vArr) {
			driver.drive(v);
		}

	}

}
