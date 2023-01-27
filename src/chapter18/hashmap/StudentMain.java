package chapter18.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		
		//학생정보, 점수
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//중복안됨
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김민즈"), 85);
		map.put(new Student(3, "서주희"), 90);
		map.put(new Student(4, "하동길"), 98);
		
		//지정된 총 Entry 수 출력
		System.out.println("총 Entry 수 : " + map.size());
		
		//하나씩 처리하는 방법
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		while(true) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("학생 번호를 입력하세요 : ");
			int sno = scan.nextInt();
			System.out.print("학생 이름을 입력하세요 : ");
			String name = scan.next();
			
			int score;
			
			try {
				score = map.get(new Student(sno, name));
				System.out.println(score);
			}catch (Exception e) {
				System.out.println(name + " 학생의 정보는 없습니다");
			}finally {
				System.out.println();
			}
			
			scan.close();
		}
	}

}
