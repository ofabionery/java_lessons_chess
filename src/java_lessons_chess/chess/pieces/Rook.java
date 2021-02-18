package java_lessons_chess.chess.pieces;

import java_lessons_chess.boardgame.Board;
import java_lessons_chess.chess.ChessPiece;
import java_lessons_chess.chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
