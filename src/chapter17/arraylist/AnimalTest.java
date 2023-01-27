package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Animal {
	
	public void move() {
		System.out.println("동물이 움직입니다");
	}
	
}

class Human extends Animal {
	
	public void move() {
		System.out.println("사람은 두 발로 걷습니다");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다");
	}
	
}

class Tiger extends Animal {
	
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다");
	}
	
}

class Eagle extends Animal {
	
	public void move() {
		System.out.println("독수리가 하늘을 납니다");
	}
	
	public void flying() {
		System.out.println("독수리는 날개를 펴고 날아다닙니다");
	}
	
}

public class AnimalTest {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		
		AnimalTest aniTest = new AnimalTest();
		System.out.println("----- 업캐스팅 -----");
		//addAnimal -> 업캐스팅 메소드
		aniTest.addAnimal();
		System.out.println("----- 다운캐스팅 -----");
		//testCasting -> 다운캐스팅 메소드
		aniTest.testCasting();

	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal a : aniList) {
			a.move();
		}
	}
	
	public void testCasting() {
		Iterator<Animal> it = aniList.iterator();
		
		while(it.hasNext()) {
			Animal a = it.next();
			
			if(a instanceof Human) {
				((Human)a).readBook();
			}else if(a instanceof Tiger) {
				((Tiger)a).hunting();
			}else if(a instanceof Eagle) {
				((Eagle)a).flying();
			}else {
				System.out.println("동물이 아닙니다");
			}
		}
	}
}
