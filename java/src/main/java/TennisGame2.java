
public class TennisGame2 implements TennisGame
{
	private Match match;

    public TennisGame2(String player1Name, String player2Name) {
        this.match = new Match(player1Name, player2Name);
    }

    public String getScore(){
    	if(match.hasWinner())
    		return "Win for " + match.winner().getName();
    	else if(match.hasAdvantage())
    		return "Advantage " + match.advantage().getName();

    	return match.state();
    }

    public void wonPoint(String player) {
        if (player == "player1") {
			match.wonPointPlayerOne();
        } else {
        	match.wonPointPlayerTwo();
        }
    }
}