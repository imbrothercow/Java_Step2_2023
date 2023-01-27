package chapter22;

import java.util.Scanner;

public class ThreadCount implements Runnable {
	
	private int n;
	
	public ThreadCount(int n) {
		this.n = n;
	}

	public static void main(String[] args) {
		
		/*
		스캐너를 이용하여 키보드에서 숫자를 입력받고
		입력받은 숫자가 1씩 감소하다가 0이 되었을 때
		"종료"라는 메세지와 함께 스레드를 빠져나오도록 구현하시오
		*/
		System.out.println("값을 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ThreadCount tc = new ThreadCount(num);
		Thread tcThread = new Thread(tc);
		tcThread.start();
		
		try {
			tcThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
		
		scan.close();

	}

	@Override
	public void run() {
		
		while(this.n-- > 0) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(this.n);
		}
		
	}

}
