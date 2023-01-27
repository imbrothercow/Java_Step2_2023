package chapter17.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {
	
	public void personMgr() {
		
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<Person>();
		
		Scanner scan = new Scanner(System.in);
		
		run : while(true) {
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보보기");
			System.out.println("4. 종료");
			System.out.print("항목선택 : ");
			select = scan.nextInt();
			Iterator<Person> it;
			
			//if switch
			switch(select) {
			case 1:
				p = new Person();
				System.out.print("이름 : ");
				p.setName(scan.next());
				System.out.print("나이 : ");
				p.setAge(scan.nextInt());
				System.out.print("전화 : ");
				p.setTel(scan.next());
				personArr.add(p);
				
				System.out.println("정보가 저장되었습니다");
				break;
			case 2:
				it = personArr.iterator();
				System.out.print("이름 : ");
				String name = scan.next();
				int beforeSize = personArr.size();
				
				while(it.hasNext()) {
					Person person = it.next();
					if(person.getName().equals(name)) {
						it.remove();
						System.out.println(name + "회원이 탈퇴하였습니다");
					}
				}
				
				if(beforeSize == personArr.size()) {
					System.out.println(name + "이라는 이름의 회원은 없습니다");
				}
				
				break;
			case 3:
				it = personArr.iterator();
				while(it.hasNext()) {
					p = it.next();
					System.out.println("이름 : " + p.getName());
					System.out.println("나이 : " + p.getAge());
					System.out.println("전화 : " + p.getTel());
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				break run;
			} //switch
			
			System.out.println();
		} //while(true)
		
		scan.close();
	} //personMgr

}
