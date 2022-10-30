
public class Connect4Grid2DArray extends Connect4Game implements Connect4Grid {

	static final int ROWS = 7;
	static final int COLUMNS = 8;

	String[][] grid = new String[ROWS][COLUMNS];

	public static void main(String[] args) {

	}

	public void emptyGrid() {
		for (int i = 1; i < ROWS; i++) {
			for (int j = 1; j < COLUMNS; j++) {
				grid[i][j] = " ";
			}
		}
	}

	public boolean isValidColumn(int column) {
		if (column >= 1 && column < COLUMNS && !isColumnFull(column))
			return true;
		else
			return false;
	}

	public String toString() {
		String gridstr = "";
		for (int i = ROWS - 1; i >= 1; i--) {
			gridstr += "\n";
			for (int j = 1; j < COLUMNS; j++)
				gridstr = gridstr + "|" + grid[i][j];
		}
		return gridstr;
	}

	public boolean isColumnFull(int column) {
		for (int i = 1; i < ROWS; i++) {
			if (grid[i][column] == " ")
				return false;
		}
		return true;
	}

	public void dropPiece(ConnectPlayer player, int column) {
		int row = 0;
		if (isColumnFull(column)) {
			System.out.print("column is full");
		} else {
			for (int i = 1; i < ROWS; i++) {
				if (grid[i][column] == " ") {
					row = i;
					break;
				}
			}
			grid[row][column] = player.getPlayerPiece();

		}

	}

	public boolean didLastPieceConnect4() {
		// row
		for (int i = 1; i < ROWS; i++) {
			for (int j = 1; j < (COLUMNS - 4) + 1; j++) {
				if (grid[i][j] == grid[i][j + 1] && grid[i][j + 1] == grid[i][j + 2]
						&& grid[i][j + 2] == grid[i][j + 3]) {
					if (grid[i][j] == "Y") {
						System.out.print("YELLOW wins");
						return true;
					}
					else if (grid[i][j] == "R") {
						System.out.print("RED wins");
						return true;
					}
				}
			}
		}

		// col
		for (int i = 1; i < (ROWS - 4 + 1); i++) {
			for (int j = 1; j < COLUMNS; j++) {
				if (grid[i][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j]
						&& grid[i + 2][j] == grid[i + 3][j]) {
					if (grid[i][j] == "Y") {
						System.out.print("YELLOW wins");
						return true;
					}
					else if (grid[i][j] == "R") {
						System.out.print("RED wins");
						return true;
					}
				}
			}
		}

		// diag
		for (int i = ROWS; i < 4; i++) {
			for (int j = 1; j <= COLUMNS - 4 + 1; j++) {
				if (grid[i][j] == grid[i - 1][j + 1] && grid[i - 1][j + 1] == grid[i - 2][j + 2]
						&& grid[i - 2][j + 2] == grid[i - 3][j + 2]) {
					if (grid[i][j] == "Y") {
						System.out.print("YELLOW wins");
						return true;
					}
					else if (grid[i][j] == "R") {
						System.out.print("RED wins");
						return true;
					}
				}
			}
		}

		for (int i = 1; i < ROWS - 4 + 1; i++) {
			for (int j = 1; j < COLUMNS - 4 + 1; j++) {
				if (grid[i][j] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 2]
						&& grid[i + 2][j + 2] == grid[i + 3][j + 2]) {
					if (grid[i][j] == "Y") {
						System.out.print("YELLOW wins");
						return true;
					}
					else if (grid[i][j] == "R") {
						System.out.print("RED wins");
						return true;
					}
				}
			}
		}

		return false;

	}

	public boolean isGridFull() {
		for (int i = 1; i < ROWS; i++) {
			for (int j = 1; j < COLUMNS; j++) {
				if (grid[i][j] == " ") {
					return false;
				}
			}
		}
		return true;
	}

}
