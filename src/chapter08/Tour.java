package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		
		boolean run = true;
		Scanner s = new Scanner(System.in);
		
		System.out.print("관광객 수 : ");
		int guestCnt = s.nextInt();
		Guide guide = new Guide(guestCnt);
				
		System.out.println("관광객 등록 : ");
		for(int i=0; i<guide.guest.length; i++) {
			System.out.print((i+1) + ". 이름 : ");
			guide.guest[i].setName(s.next());
			System.out.print((i+1) + ". 성별 : ");
			guide.guest[i].setGender(s.next());
			System.out.println("-------------------");
		}
		
		while(run) {
			System.out.println("===================");
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.println("===================");
			
			int option = s.nextInt();
			switch(option) {
			case 1: // 관광객 정보
				System.out.println("-------------------");
				for(int i=0; i<guide.guest.length; i++) {
					System.out.println((i+1) + ". 이름 : " + guide.guest[i].getName());
					System.out.println((i+1) + ". 성별 : " + guide.guest[i].getGender());
					System.out.println((i+1) + ". 목적지 : " + Guide.point);
					System.out.println("-------------------");
				}
				break;
			case 2: // 목적지 변경
				System.out.print("변경할 목적지를 입력하세요 : ");
				String point = s.next();
				System.out.println("목적지가 " + Guide.point + "에서 " + point + "(으)로 변경됐습니다");
				Guide.point = point;
				break;
			case 3: // 종료
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		}

	}

}
