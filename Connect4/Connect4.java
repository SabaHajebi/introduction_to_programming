
public class C4HumanPlayer extends ConnectPlayer {
	
	String playerType = "Human";
	String playerPiece;
	
	public String getPlayerType() {
		return playerType;
	}
	
	public String getPlayerPiece() {
		return playerPiece;
	}

	public void setPlayerPiece(String piece) {
		playerPiece = piece;
	}
}

public class C4RandomAIPlayer extends ConnectPlayer {
	
	String playerType = "AI";
	String playerPiece;
	
	public String getPlayerType() {
		return playerType;
	}
	
	public String getPlayerPiece() {
		return playerPiece;
	}
	
	public void setPlayerPiece(String piece) {
		playerPiece = piece;
	}
}

/* SELF ASSESSMENT
Connect4Game class (35/35 marks)
My class creates references to the Connect 4 Grid and two Connect 4 Players. It asks the user whether he/she would like to play/quit inside a loop. If the user decides to play then: 1. Connect4Grid2DArray is created using the Connect4Grid interface, 2. the two players are initialised - must specify the type to be ConnectPlayer, and 3. the game starts. In the game, I ask the user where he/she would like to drop the piece. I perform checks by calling methods in the Connect4Grid interface. Finally a check is performed to determine a win. 
Comment: I do all of this, checking for errors with hasNextInt() and using a while loop for the main part of the game.
Connect4Grid interface (10/10 marks)
I define all 7 methods within this interface.
Comment: I do this.
Connect4Grid2DArray class (25/25 marks) 
My class implements the Connect4Grid interface. It creates a grid using a 2D array Implementation of the method to check whether the column to drop the piece is valid. It provides as implementation of the method to check whether the column to drop the piece is full. It provides as implementation of the method to drop the piece.  It provides as implementation of the method to check whether there is a win.
Comment: I do all of this, using constants to go through the array, and using multiple for and while loops to check if the last piece dropped won the game. 
ConnectPlayer abstract class (5/10 marks)
My class provides at least one non-abstract method and at least one abstract method. 
Comment: My class only provides abstract methods. 
C4HumanPlayer class (10/10 marks)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides the Human player functionality.
Comment: My class does this, specifying itself as a ?Human? playerType.
C4RandomAIPlayer class (10/10 marks)
My class extends the ConnectPlayer class and overrides the abstract method(s). It provides AI player functionality. 
Comment: My class does this, specifying itself as an ?AI? playerType.
Total Marks out of 100: 95
*/

import java.util.Random;
import java.util.Scanner;

public class Connect4Game {

	static final int PLAY_PLAYER = 1;
	static final int PLAY_AI = 2;
	static final String PLAYER_TYPE_HUMAN = "Human";
	static final String PLAYER_TYPE_AI = "AI";
	public static final String PIECE_X = "X";
	public static final String PIECE_O = "O";
	
	public static void main(String[] args) {
		System.out.println("1. Another player.");
		System.out.println("2. AI.");
		System.out.println("Who would you like to play against? ");
		Scanner inputScanner = new Scanner(System.in);
		int userOpponentChoice = -1;
		if (inputScanner.hasNextInt()) {
			userOpponentChoice = inputScanner.nextInt();
			
			ConnectPlayer playerOne = new C4HumanPlayer();
			ConnectPlayer playerTwo = null;
			
			switch (userOpponentChoice) {
			case PLAY_PLAYER:
				playerTwo = new C4HumanPlayer();
				break;
			case PLAY_AI:
				playerTwo = new C4RandomAIPlayer();
				break;
			}
			
			Connect4Grid2DArray grid = new Connect4Grid2DArray();
			ConnectPlayer currentPlayer = playerOne;
			boolean finished = false;
			int columnChoice = -1;
			Random random = new Random();
			
			int colourChoice = random.nextInt(2);
			if (colourChoice == 0) {
				playerOne.setPlayerPiece(PIECE_X);
				playerTwo.setPlayerPiece(PIECE_O);
			} else if (colourChoice == 1) {
				playerOne.setPlayerPiece(PIECE_O);
				playerTwo.setPlayerPiece(PIECE_X);
			}
			
			grid.emptyGrid();
			while (!finished) {
				System.out.println(grid.toString());
				if (!grid.isGridFull()) {
					System.out.println("" + currentPlayer.getPlayerPiece() + "'s turn.");
					if (currentPlayer.getPlayerType() == PLAYER_TYPE_HUMAN) {
						inputScanner = new Scanner(System.in);
						System.out.println("Which column would you like to drop a piece? (Or enter 0 to exit)");
						if (inputScanner.hasNextInt()) {
							columnChoice = inputScanner.nextInt();
						} else {
							System.out.println("Invalid input.");
							columnChoice = -1;
						}
					} else {
						columnChoice = random.nextInt(Connect4Grid2DArray.NUM_OF_COLUMNS) + 1;
					}
					
					if (columnChoice == 0) {
						System.out.println("Exited.");
						finished = true;
					} else if (grid.isValidColumn(columnChoice)) {
						grid.dropPiece(currentPlayer, columnChoice);
						if (grid.didLastPieceConnect4()) {
							System.out.println(grid.toString());
							System.out.println("" + currentPlayer.getPlayerPiece() + " wins!");
							finished = true;
						} else if (currentPlayer == playerOne) {
							currentPlayer = playerTwo;
						} else {
							currentPlayer = playerOne;
						}
					}			
				} else {
					finished = true;
				}
			}
		} else {
			System.out.println("Invalid input.");
		}
		inputScanner.close();
	}
}

public interface Connect4Grid {
	public abstract void emptyGrid();
	public abstract String toString();
	public abstract boolean isValidColumn(int column);
	public abstract boolean isColumnFull(int column);
	public abstract void dropPiece(ConnectPlayer player, int column);
	public abstract boolean didLastPieceConnect4();
	public abstract boolean isGridFull();  
}

public class Connect4Grid2DArray implements Connect4Grid {
	
	static final int NUM_OF_ROWS = 6;
	static final int NUM_OF_COLUMNS = 7;
	static final String EMPTY_SLOT = " ";
	
	String[][] gridArray = new String[NUM_OF_ROWS][NUM_OF_COLUMNS];

	public void emptyGrid() {
		for (int i = 0; i < NUM_OF_ROWS; i++) {
			for (int j = 0; j < NUM_OF_COLUMNS; j++) {
				gridArray[i][j] = EMPTY_SLOT;
			}
		}
	}

	public String toString() {
		String gridString = "";
		
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[0][0]+"|"+gridArray[0][1]+"|"+gridArray[0][2]+"|"
		+gridArray[0][3]+"|"+gridArray[0][4]+"|"+gridArray[0][5]+"|"+gridArray[0][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[1][0]+"|"+gridArray[1][1]+"|"+gridArray[1][2]+"|"
		+gridArray[1][3]+"|"+gridArray[1][4]+"|"+gridArray[1][5]+"|"+gridArray[1][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[2][0]+"|"+gridArray[2][1]+"|"+gridArray[2][2]+"|"
		+gridArray[2][3]+"|"+gridArray[2][4]+"|"+gridArray[2][5]+"|"+gridArray[2][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[3][0]+"|"+gridArray[3][1]+"|"+gridArray[3][2]+"|"
		+gridArray[3][3]+"|"+gridArray[3][4]+"|"+gridArray[3][5]+"|"+gridArray[3][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[4][0]+"|"+gridArray[4][1]+"|"+gridArray[4][2]+"|"
		+gridArray[4][3]+"|"+gridArray[4][4]+"|"+gridArray[4][5]+"|"+gridArray[4][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		gridString += "|"+gridArray[5][0]+"|"+gridArray[5][1]+"|"+gridArray[5][2]+"|"
		+gridArray[5][3]+"|"+gridArray[5][4]+"|"+gridArray[5][5]+"|"+gridArray[5][6]+"|\n";
		gridString += "|-+-+-+-+-+-+-|\n";
		
		return gridString;
	}

	public boolean isValidColumn(int column) {
		if (column >= 1 && column <= NUM_OF_COLUMNS && !isColumnFull(column)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isColumnFull(int column) {
		if (gridArray[0][column-1] == EMPTY_SLOT) {
			return false;
		} else {
			return true;
		}
	}

	public void dropPiece(ConnectPlayer player, int column) {
		boolean pieceDropped = false;
		for (int i = 0; i < NUM_OF_ROWS && !pieceDropped; i++) {
			if (gridArray[NUM_OF_ROWS-1][column-1] == EMPTY_SLOT) {
				gridArray[NUM_OF_ROWS-1][column-1] = player.getPlayerPiece();
				pieceDropped = true;
			} else if (gridArray[i+1][column-1] != EMPTY_SLOT) {
				gridArray[i][column-1] = player.getPlayerPiece();
				pieceDropped = true;
			}
		}
	}
	
	public boolean didLastPieceConnect4() {
		int currentRow = 5;
		int streakCount = 0;
		int rowIncrement = 1;
		int colIncrement = 1;
		for(; currentRow >= 0; currentRow--) {
			int currentCol = 6;
			for(; currentCol >= 0; currentCol--) {
				if(gridArray[currentRow][currentCol] != EMPTY_SLOT) {
					String piece = gridArray[currentRow][currentCol];
					while(rowIncrement <= 3) {
						try {
							if(gridArray[currentRow + rowIncrement][currentCol] == piece) {
								streakCount++;
								if(streakCount == 4) {
									return true;
								}
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							break;
						}
						rowIncrement++;
					}
					streakCount = 0;
					rowIncrement = 0;
					colIncrement = 0;
					while(colIncrement <= 3) {
						try {
							if(gridArray[currentRow][currentCol + colIncrement] == piece) {
								streakCount++;
								if(streakCount == 4) {
									return true;
								}
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							break;
						}
						colIncrement++;
					}
					streakCount = 0;
					rowIncrement = 0;
					colIncrement = 0;
					while(rowIncrement <= 3) {
						try {
							if(gridArray[currentRow + rowIncrement][currentCol + colIncrement] == piece) {
								streakCount++;
								if(streakCount == 4) {
									return true;
								}
							}
						} catch (ArrayIndexOutOfBoundsException e) {
							break;
						}
						rowIncrement++;
						colIncrement++;
					}
					streakCount = 0;
					rowIncrement = 0;
					colIncrement = 0;
					while(rowIncrement <= 3) {
						try {
							if(gridArray[currentRow + rowIncrement][currentCol + colIncrement] == piece) {
								streakCount++;
								if(streakCount == 4) {
									return true;
								}
							} 
						} catch (ArrayIndexOutOfBoundsException e) {
							break;
						}
						rowIncrement++;
						colIncrement--;
					}
					streakCount = 0;
					rowIncrement = 0;
					colIncrement = 0;
				} 
			}
		}
		return false;
	}
	
	public boolean isGridFull() {
		for (int i = 0; i < NUM_OF_ROWS; i++) {
			for (int j = 0; j < NUM_OF_COLUMNS; j++) {
				if (gridArray[i][j] == EMPTY_SLOT) {
					return false;
				}
			}
		}
		return true;
	}
}

public abstract class ConnectPlayer {
	public abstract String getPlayerType();
	public abstract String getPlayerPiece();
	public abstract void setPlayerPiece(String piece);
}

