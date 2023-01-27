package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal[] animals = {new Bear(), new Lion(), new Spider()};
		
		for(Animal a : animals) {
			
			String animalName = "";
			
			if(a instanceof Bear) {
				System.out.println("----곰----");
				animalName = "곰";
			}else if(a instanceof Lion) {
				System.out.println("----사자----");
				animalName = "사자";
			}else if(a instanceof Spider) {
				System.out.println("----거미----");
				animalName = "거미";
			}
			
			System.out.println(animalName + " eye 개수 : " + a.getEye());
			System.out.println(animalName + " leg 개수 : " + a.getLeg());
			
			try {
				System.out.println(((Bear)a).woong);
			} catch (Exception e) {}
			
			try {
				System.out.println(((Lion)a).galgi);
			}catch (Exception e) {}
			
			try {
				System.out.println(((Spider)a).web);
			}catch (Exception e) {}
		}

	}

}
