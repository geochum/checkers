package checkers;

public class Square {
	private Piece piece;
	private boolean hasPiece;
	
	public boolean hasPiece() {
		return hasPiece;
	}
	public Piece getPiece() {
		return piece;
	}
	public void setPiece(Piece piece) {
		this.piece = piece;
		this.hasPiece = true;
	}
	public void removePiece() {
		this.piece = null;
		this.hasPiece = false;
	}
	
}
