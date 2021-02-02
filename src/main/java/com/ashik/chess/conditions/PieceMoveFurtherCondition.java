package com.ashik.chess.conditions;

import com.ashik.chess.model.Board;
import com.ashik.chess.model.Cell;
import com.ashik.chess.model.Piece;

/**
 * @author ashik
 * 
 * Condition interface to tell whether a piece can further move from a cell.
 */
public interface PieceMoveFurtherCondition {

    boolean canPieceMoveFurtherFromCell(Piece piece, Cell cell, Board board);
}
