package checkers;

import java.util.Scanner;

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
		System.out.println("WELCOME TO CHECKERS!");
		board.displayBoard();
		while(true) {
			playerTurn(true);
			break;
		}
	}
	
	private void playerTurn(boolean isBlack) {
		Scanner scanner = new Scanner(System.in);
		if(isBlack) {
			System.out.print("PLAYER 1, CHOOSE A BLACK PIECE: ");
		} else {
			System.out.print("PLAYER 2, CHOOSE A RED PIECE: ");
		}
		while(scanner.hasNext()) {
			scanner.next();
		}
	}
	
}
