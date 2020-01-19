package checkers;

public class Piece {
	private boolean isBlack;
	private boolean isKing;
	
	public Piece(boolean isBlack) {
		setBlack(isBlack);
	}
	
	public boolean isBlack() {
		return isBlack;
	}
	private void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}
	public boolean isKing() {
		return isKing;
	}
	public void setKing(boolean isKing) {
		this.isKing = isKing;
	}
}
