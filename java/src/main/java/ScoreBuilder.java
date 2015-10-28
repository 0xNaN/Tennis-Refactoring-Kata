
public class ScoreBuilder {

	private int playerOnePoints;
	private int playerTwoPoints;

	public ScoreBuilder(int playerOnePoints, int playerTwoPoints) {
		this.playerOnePoints = playerOnePoints;
		this.playerTwoPoints = playerTwoPoints;
	}

	public String getScore() {		
		if (playerOnePoints == playerTwoPoints) {
			if(playerOnePoints >= 3)
				return "Deuce";
			else
				return pointsToString(playerOnePoints) + "-All";
		}
		
		return pointsToString(playerOnePoints) + "-" + pointsToString(playerTwoPoints);
	}

	private String pointsToString(int points) {
		if (points == 0)
			return "Love";
		if (points == 1)
			return "Fifteen";
		if (points == 2)
			return "Thirty";
		if (points == 3)
			return "Forty";
		return "";
	}

}
