package chapter09;

public class SportCar extends Car{
	
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed : " + speed);
	}

	/*
	public void stop() {
		System.out.println("스포트카가 멈춥니다");
		speed = 0;
	}
	*/

	public static void main(String[] args) {
		
		SportCar ac = new SportCar();
		ac.speedUp();
		System.out.println("speed : " + ac.speed);
		ac.stop();

	}

}
