package checkers;

public class Board {
	private Square[][] board;
	private final int BOARD_SIZE = 8;
	private final int NUM_OF_PIECES = 12;
	
	public Board() {
		board = new Square[BOARD_SIZE][BOARD_SIZE];
		setBoard();
	}
	
	private void setBoard() {
		for(int r = 0; r < BOARD_SIZE; r++) {
			for(int c = 0; c < BOARD_SIZE; c++) {
				board[r][c] = new Square();
				if((r + c) % 2 != 0) {
					if(r < NUM_OF_PIECES / (BOARD_SIZE / 2)) {
						board[r][c].setPiece(new Piece(false));
					}
					if(r > BOARD_SIZE - (NUM_OF_PIECES / (BOARD_SIZE / 2)) - 1) {
						board[r][c].setPiece(new Piece(true));
					}
				}
			}
		}
	}
	
	public void displayBoard() {
		for(int r = 0; r < BOARD_SIZE; r++) {
			for(int c = 0; c < BOARD_SIZE; c++) {
				if(board[r][c].hasPiece()) {
					System.out.print(board[r][c].getPiece() + "\t");
				} else {
					System.out.print("//" + "\t");
				}
			}
			System.out.println();
		}
	}
}
