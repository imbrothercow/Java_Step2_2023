package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		
		//기본게임 1단계
		Player player = new Player();
		player.play(1);
		
		//레벨 2단계
		player.updgradeLevel(new AdvancedLevel());
		player.play(2);

		//레벨 3단계
		player.updgradeLevel(new SuperLevel());
		player.play(3);
		
	}

}
