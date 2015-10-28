
public class Match {

	private int P2point;
	private int P1point;
	private String player1Name;
	private String player2Name;
	private String winner;
	private String advantage;
	
	public Match(String player1Name, String player2Name) {
		this.player1Name = player1Name;
		this.player2Name = player2Name;
		
		this.P2point = 0;
		this.P1point = 0;
	}

	public boolean hasWinner() {
		if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
			winner = player1Name;
            return true;
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
        	winner = player2Name;
            return true;
        }
        
		return false;
	}

	public String winner() {
		return winner;
	}

	public void wonPointPlayerOne() {
		this.P1point++;
	}

	public void wonPointPlayerTwo() {
		this.P2point++;
	}

	public boolean hasAdvantage() {
        if (P1point > P2point && P2point >= 3)
        {
        	advantage = player1Name;
            return true;
        }
        
        if (P2point > P1point && P1point >= 3)
        {
        	advantage = player2Name;
            return true;
        }
		return false;
	}

	public String advantage() {
		return advantage;
	}

	public String state() {
		String P1res = "", P2res = "";
        String score = "";
        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0)
                score = "Love";
            if (P1point==1)
                score = "Fifteen";
            if (P1point==2)
                score = "Thirty";
            score += "-All";
        }
        if (P1point==P2point && P1point>=3)
            score = "Deuce";
        
        if (P1point > 0 && P2point==0)
        {
            if (P1point==1)
                P1res = "Fifteen";
            if (P1point==2)
                P1res = "Thirty";
            if (P1point==3)
                P1res = "Forty";
            
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            if (P2point==1)
                P2res = "Fifteen";
            if (P2point==2)
                P2res = "Thirty";
            if (P2point==3)
                P2res = "Forty";
            
            P1res = "Love";
            score = P1res + "-" + P2res;
        }
        
        if (P1point>P2point && P1point < 4)
        {
            if (P1point==2)
                P1res="Thirty";
            if (P1point==3)
                P1res="Forty";
            if (P2point==1)
                P2res="Fifteen";
            if (P2point==2)
                P2res="Thirty";
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            if (P2point==2)
                P2res="Thirty";
            if (P2point==3)
                P2res="Forty";
            if (P1point==1)
                P1res="Fifteen";
            if (P1point==2)
                P1res="Thirty";
            score = P1res + "-" + P2res;
        }        
		return score;
	}
}
