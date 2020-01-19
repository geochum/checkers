package checkers;

public class Square {
	private Piece piece;
	private boolean hasPiece;
	
	public boolean hasPiece() {
		return hasPiece;
	}
	public void setPiece(boolean hasPiece) {
		this.hasPiece = hasPiece;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	public String toString() {
		if(hasPiece) {
			return piece.toString();
		} else {
			return "\\";
		}
	}
	
}
