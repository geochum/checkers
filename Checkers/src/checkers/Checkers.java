package checkers;

public class Checkers {
	private Board board;

	public static void main(String[] args) {
		Checkers checkers = new Checkers();
		checkers.play();
	}
	
	public void play() {
		board.displayBoard();
	}
	
	public Checkers() {
		board = new Board();
	}
}
