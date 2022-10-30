/* SELF ASSESSMENT
Connect4Game class (35 marks)
My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win. 
Comment: My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win.

Connect4Grid interface (10 marks)
I define all 7 methods within this interface.
Comment: I define all 7 methods within this interface.
Connect4Grid2DArray class (25 marks) 
My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
Comment: My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
ConnectPlayer abstract class (10 marks)
My class provides at lest one non-abstract method and at least one abstract method. 
Comment: My class provides at lest one non-abstract method and at least one abstract method. 
C4HumanPlayer class (10 marks)
My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides the Human player functionality.
Comment: My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides the Human player functionality.
C4RandomAIPlayer class (10 marks)
My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides AI player functionality. 
Comment: My class extends the ConnectPlayer claas and overrides the abstract method(s). It provides AI player functionality. 
Total Marks out of 100: 100
 */
import java.util.Random;
import java.util.Scanner;
public class Connect4Game {

	static final int PLAYER = 1;
	static final int AI = 2;
	static final int COLOUR1 = 0;
	static final int COLOUR2 = 1;
	static final String PLAYER_HUMAN = "Human";
	static final String PLAYER_AI = "AI";
	public static final String YELLOW = "Y";
	public static final String RED = "R";


	public static void main(String[] args) {
		boolean finish = false;
		int colChoice = 0;
		
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter who you want to play against: \n1. Another player \n2. The computer \nOr enter 'quit'" );
		while(input.hasNextInt()) {
			int opponent = input.nextInt();
			if (opponent != PLAYER && opponent != AI) {
				System.out.println("Please enter 1 or 2");
			}

			ConnectPlayer player1 = new C4HumanPlayer();
			ConnectPlayer player2 = null;

			if (opponent == PLAYER) {
				player2 = new C4HumanPlayer();
			}
			else{
				player2 = new C4RandomAIPlayer();
			}


			Connect4Grid2DArray grid = new Connect4Grid2DArray();
			grid.emptyGrid();
			ConnectPlayer currPlayer = player1;
			int colour = random.nextInt(2);

			switch(colour) {
			case COLOUR1:
				player1.setPlayerPiece(YELLOW);
				player2.setPlayerPiece(RED);
				break;

			case COLOUR2:
				player1.setPlayerPiece(YELLOW);
				player2.setPlayerPiece(RED);
				break;
			}
			while (!finish) {
				if (!grid.isGridFull()) {
					System.out.println(grid.toString());
					System.out.println("" + currPlayer.getPlayerPiece() + "'s turn.");
					if (currPlayer.getPlayerType() == PLAYER_HUMAN)
						System.out.println("Where would you like to drop your disc?");
					colChoice = input.nextInt();
				}
				else 
					colChoice = random.nextInt(Connect4Grid2DArray.COLUMNS);

				if (grid.isValidColumn(colChoice)) {
					grid.dropPiece(currPlayer, colChoice);
					if(grid.didLastPieceConnect4()) {
						finish = true;
					}
					if (currPlayer == player1) 
						currPlayer = player2;
					else 
						currPlayer = player1;
				}
				finish = false;
			}
		}
	}
}



