package java_lessons_chess.chess.pieces;

import java_lessons_chess.boardgame.Board;
import java_lessons_chess.chess.ChessPiece;
import java_lessons_chess.chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
