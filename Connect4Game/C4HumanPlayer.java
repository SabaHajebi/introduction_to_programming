
public class C4HumanPlayer extends ConnectPlayer{

	String playerString = "human";
	String pieceString;
	
	public String getPlayerType() {
		return playerString;
	}
	
	public String getPlayerPiece() {
		return pieceString ;
	}

	public void setPlayerPiece(String piece) {
		pieceString = piece;
	}

}
