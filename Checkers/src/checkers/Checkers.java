package checkers;

public class Checkers {
	private Board board;

	public static void main(String[] args) {
		Checkers checkers = new Checkers();
		checkers.play();
	}
	
	public Checkers() {
		board = new Board();
	}
	
	public void play() {
		board.displayBoard();
		while(true) {
			playerTurn(true);
			break;
		}
	}
	
	private void playerTurn(boolean isBlack) {
		if(isBlack) {
			System.out.println("PLAYER 1, CHOOSE A BLACK PIECE: ");
		} else {
			System.out.println("PLAYER 2, CHOOSE A WHITE PIECE: ");
		}
	}
	
}
