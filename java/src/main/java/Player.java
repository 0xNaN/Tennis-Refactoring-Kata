
public class Player {

	private String name;
	private int points;
	
	public Player(String name) {
		this.name = name;
		this.points = 0;
	}

	public String getName() {
		return this.name;
	}
	
	public boolean wins(Player player) {
		return (getPoints() >= 4 && player.getPoints()>=0 && (getPoints() - player.getPoints())>=2);
	}
	
	public boolean hasAdvantage(Player player) {
		return (getPoints() > player.getPoints() && player.getPoints() >= 3);
	}
	
	public int getPoints() {
		return points;
	}

	public void incPoints() {
		this.points++;
	}
}
