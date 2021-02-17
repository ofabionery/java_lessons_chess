package java_lessons_chess.application;

import java_lessons_chess.chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}
}
