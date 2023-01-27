package chapter22;

import java.io.IOException;
import java.util.Random;

public class Runners {

	public static void main(String[] args) {
		
		int[] playerRandom = new int[5]; //0 3 1 1 2
		String[] playerJump = {"★", "☆", "○", "●", "■"};
		
		boolean finish = false;
		int finishPlayer = 0;
		
		//각 선수에게 도약거리 적용
		outer : while(true) {
			
			//도약거리
			for(int i=0; i<playerRandom.length; i++) {
				playerRandom[i] = new Random().nextInt(4); //0 ~ 3
			}
			
			//0.1초 간격으로 휴식
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i=0; i<playerRandom.length; i++) {
				for(int j=0; j<playerRandom[i]; j++) {
					playerJump[i] = " " + playerJump[i];
				}
				System.out.println(playerJump[i]);	
			}
			
			for(int i=0; i<playerRandom.length; i++) {
				if(playerJump[i].length() > 15) {
					System.out.println((i+1) + "번째 선수 승리!");
					break outer;
				}
			}
			System.out.println("\n\n");
		}

	}

}
