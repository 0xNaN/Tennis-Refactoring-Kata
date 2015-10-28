
public class Match {

	private Player winner;
	private Player advantage;
	private Player playerTwo;
	private Player playerOne;
	
	public Match(String player1Name, String player2Name) {
		this.playerOne = new Player(player1Name);
		this.playerTwo = new Player(player2Name);
	}

	public boolean hasWinner() {
		if (playerOne.getPoints()>=4 && playerTwo.getPoints()>=0 && (playerOne.getPoints()-playerTwo.getPoints())>=2)
        {
			winner = playerOne;
            return true;
        }
        if (playerTwo.getPoints()>=4 && playerOne.getPoints()>=0 && (playerTwo.getPoints()-playerOne.getPoints())>=2)
        {
        	winner = playerTwo;
            return true;
        }
        
		return false;
	}

	public Player winner() {
		return winner;
	}

	public void wonPointPlayerOne() {
		this.playerOne.incPoints();
	}

	public void wonPointPlayerTwo() {
		this.playerTwo.incPoints();
	}

	public boolean hasAdvantage() {
        if (playerOne.getPoints() > playerTwo.getPoints() && playerTwo.getPoints() >= 3)
        {
        	advantage = playerOne;
            return true;
        }
        
        if (playerTwo.getPoints() > playerOne.getPoints() && playerOne.getPoints() >= 3)
        {
        	advantage = playerTwo;
            return true;
        }
		return false;
	}

	public Player advantage() {
		return advantage;
	}

	public String state() {
		String P1res = "", P2res = "";
        String score = "";
        if (playerOne.getPoints() == playerTwo.getPoints() && playerOne.getPoints() < 4)
        {
            if (playerOne.getPoints()==0)
                score = "Love";
            if (playerOne.getPoints()==1)
                score = "Fifteen";
            if (playerOne.getPoints()==2)
                score = "Thirty";
            score += "-All";
        }
        if (playerOne.getPoints()==playerTwo.getPoints() && playerOne.getPoints()>=3)
            score = "Deuce";
        
        if (playerOne.getPoints() > 0 && playerTwo.getPoints()==0)
        {
            if (playerOne.getPoints()==1)
                P1res = "Fifteen";
            if (playerOne.getPoints()==2)
                P1res = "Thirty";
            if (playerOne.getPoints()==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (playerTwo.getPoints() > 0 && playerOne.getPoints()==0)
        {
            if (playerTwo.getPoints()==1)
                P2res = "Fifteen";
            if (playerTwo.getPoints()==2)
                P2res = "Thirty";
            if (playerTwo.getPoints()==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (playerOne.getPoints()>playerTwo.getPoints() && playerOne.getPoints() < 4)
        {
            if (playerOne.getPoints()==2)
                P1res="Thirty";
            if (playerOne.getPoints()==3)
                P1res="Forty";
            if (playerTwo.getPoints()==1)
                P2res="Fifteen";
            if (playerTwo.getPoints()==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (playerTwo.getPoints()>playerOne.getPoints() && playerTwo.getPoints() < 4)
        {
            if (playerTwo.getPoints()==2)
                P2res="Thirty";
            if (playerTwo.getPoints()==3)
                P2res="Forty";
            if (playerOne.getPoints()==1)
                P1res="Fifteen";
            if (playerOne.getPoints()==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }        
		return score;
	}
}
