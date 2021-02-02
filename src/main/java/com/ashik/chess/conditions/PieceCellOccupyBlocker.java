package com.ashik.chess.conditions;

import com.ashik.chess.model.Board;
import com.ashik.chess.model.Cell;
import com.ashik.chess.model.Piece;
import com.ashik.chess.model.Player;

/**
 * @author ashik
 * 
 * This check tells whether a piece can occupy a given cell in the board or not.
 */
public interface PieceCellOccupyBlocker {

    boolean isCellNonOccupiableForPiece(Cell cell, Piece piece, Board board, Player player);
}
