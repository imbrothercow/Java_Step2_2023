package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//문자를 아스키코드로 형변환
			char ch = scan.next().charAt(0);
			
			Scheduler scheduler = null;
			boolean run = true;
			
			//객체 생성
			switch(ch) {
			case 'R':case 'r':
				scheduler = new RoundRobin();
				break;
			case 'L':case 'l':
				scheduler = new LeastJob();				
				break;
			case 'P':case 'p':
				scheduler = new PriorityAllocation();				
				break;
			case 'S':case 's':
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			if (scheduler != null) {
				scheduler.getNextCall();
				scheduler.sendCallToAgent();
			}
			
			if (!run) 
				break;
			
		}

	}

}
