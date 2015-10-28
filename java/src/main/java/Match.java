
public class Match {

	private Player winner = null;
	private Player advantage = null;
	
	private Player playerTwo;
	private Player playerOne;
	
	public Match(String player1Name, String player2Name) {
		this.playerOne = new Player(player1Name);
		this.playerTwo = new Player(player2Name);
		
	}

	public boolean hasWinner() {
		if(playerOne.wins(playerTwo)) {
			winner = playerOne;
			return true;
		} else if(playerTwo.wins(playerOne)) {
			winner = playerTwo;
			return true;
		}
		return false;
	}

	public Player winnerPlayer() {
		return winner;
	}

	public boolean hasAdvantage() {
		if(playerOne.hasAdvantage(playerTwo)) {
        	advantage = playerOne;
            return true;
        } else if (playerTwo.hasAdvantage(playerOne)) {
        	advantage = playerTwo;
            return true;
        }
		return false;
	}

	public Player advantagePlayer() {
		return advantage;
	}

	public String getScore() {
		ScoreBuilder scoreBuilder = new ScoreBuilder(playerOne.getPoints(), playerTwo.getPoints());
		return scoreBuilder.getScore();
	}

	public void addPointTo(String player) {
		if(playerOne.getName().equals(player))
			playerOne.incPoints();
		else
			playerTwo.incPoints();
	}
}
