package java_lessons_chess.chess;

import java_lessons_chess.boardgame.Board;
import java_lessons_chess.boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	

}
