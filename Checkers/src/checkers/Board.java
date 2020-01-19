package checkers;

public class Board {
	private Square[][] board;
	private final int BOARD_SIZE = 8;
	
	public Board() {
		board = new Square[BOARD_SIZE][BOARD_SIZE];
	}
	
	public void displayBoard() {
		for(int r = 0; r < BOARD_SIZE; r++) {
			for(int c = 0; c < BOARD_SIZE; c++) {
				System.out.print(board[r][c] + "\t");
			}
			System.out.println();
		}
	}
}
