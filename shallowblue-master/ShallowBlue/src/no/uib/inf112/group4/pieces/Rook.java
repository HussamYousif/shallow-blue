package no.uib.inf112.group4.pieces;

import java.util.ArrayList;
import java.util.List;

import no.uib.inf112.group4.framework.Coordinate;
import no.uib.inf112.group4.framework.PlayerColor;
import no.uib.inf112.group4.interfaces.IBoard;
import no.uib.inf112.group4.interfaces.IMove;

/**
 * This class represent the Rook piece in the chess game
 * 
 */
public class Rook extends Piece {
	public Rook(PlayerColor color) {
		super("Rook", color);
	}

	/**
	 * This method finds every valid moves for a piece from a location.
	 * 
	 * @param board
	 *            the game board
	 * @param from
	 *            Coordinates from where you want to move a piece from
	 * @return a list of valid moves
	 */
	@Override
	public List<IMove> getMoves(IBoard board, Coordinate from) {
		List<IMove> listOfMoves = new ArrayList<IMove>();

		addStraightLineMoves(listOfMoves, board, from, 0, 1);
		addStraightLineMoves(listOfMoves, board, from, 0, -1);
		addStraightLineMoves(listOfMoves, board, from, 1, 0);
		addStraightLineMoves(listOfMoves, board, from, -1, 0);
		return listOfMoves;
	}

	@Override
	public int getPieceValue() {
		return 5;
	}

	public boolean hasRookMoved(IBoard board) {
		return board.hasPieceMoved(this);
	}
	
	@Override
	public PieceType getType() {
		return PieceType.ROOK;
	}
}