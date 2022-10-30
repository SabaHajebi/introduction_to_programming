
public class C4RandomAIPlayer extends ConnectPlayer{

	String playerString = "AI";
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
