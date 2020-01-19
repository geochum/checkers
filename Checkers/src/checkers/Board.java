package checkers;

public class Board {
	private Square[][] board;
	private final int BOARD_SIZE = 8;
	private final int NUM_OF_PIECES = 12;
	private final int SCALE_FACTOR = 4; //MUST BE AN EVEN INTEGER

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
		int count = 1;
		for(int r = 0; r <= SCALE_FACTOR * BOARD_SIZE; r++) {
			for(int c = 0; c <= SCALE_FACTOR * BOARD_SIZE; c++) {
				if(r % SCALE_FACTOR == 0) {
					if(c % SCALE_FACTOR == 0) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				} else if(r % SCALE_FACTOR == SCALE_FACTOR / 2 && (r + c) % (2 * SCALE_FACTOR) == 0) {
					if(board[r / SCALE_FACTOR][c / SCALE_FACTOR].hasPiece()) {
						System.out.print(board[r / SCALE_FACTOR][c / SCALE_FACTOR].getPiece());
					} else {
						System.out.print("/");
					}
				} else if(r % SCALE_FACTOR == 1 && (r + c) % (2 * SCALE_FACTOR) == SCALE_FACTOR + 2) {
					System.out.printf("%2d", count++);
					c++;
				} else if(r % (2 * SCALE_FACTOR) >= SCALE_FACTOR + 1 && r % (2 * SCALE_FACTOR) <= (2 * SCALE_FACTOR) - 1 && c % (2 * SCALE_FACTOR) >= 1 && c % (2 * SCALE_FACTOR) <= SCALE_FACTOR - 1) {
					System.out.print("/");
				} else if(r % (2 * SCALE_FACTOR) >= 1 && r % (2 * SCALE_FACTOR) <= SCALE_FACTOR - 1 && c % (2 * SCALE_FACTOR) >= SCALE_FACTOR + 1 && c % (2 * SCALE_FACTOR) <= (2 * SCALE_FACTOR) - 1) {
					System.out.print("/");
				} else if(c % SCALE_FACTOR == 0) {
					System.out.print("|");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
}
