package chapter10;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		
		Airplane a = new SupersonicAirplane();
		a.fly();
		((SupersonicAirplane)a).flyMode = SupersonicAirplane.SUPERSONIC;
		a.fly();
		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
	}

}
