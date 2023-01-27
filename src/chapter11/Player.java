package chapter11;

public class Player {
	
	private PlayLevel level;
	
	public Player() {
		level = new BeginnerLevel(); // PlayLevel level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayLevel getLevel() {
		return level;
	}
	
	public void updgradeLevel(PlayLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}

}
